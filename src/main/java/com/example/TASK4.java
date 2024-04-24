package com.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.util.List;

/**
 * Create an implementation of a Rest API client.
 * Prints out how many records exists for each gender and save this file to s3 bucket
 * API endpoint=> https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda
 * AWS s3 bucket => interview-digiage
 *
 */
public class TASK4 {
    private static RestTemplate restTemplate = new RestTemplate();
    private static String url = "https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda";
    private static int generoM = 0;
    private static int generoF = 0;

    public static void main(String[] args) throws IOException {

        String result = restTemplate.getForObject(url, String.class);

        List<UserDTO> userList = convertJsonToUserDTOList(result);

        System.out.println();

        for (UserDTO user : userList){
            if (user.getGender().equals("M")) {
                generoM++;
            } else if (user.getGender().equals("F")) {
                generoF++;
            }
        }

        String caminhoArquivo = "generos-M-F.txt";

        FileWriter arquivo = new FileWriter(caminhoArquivo);
            arquivo.write( "Total de pessoas com o genero Masculino: " + generoM + "\n");
            arquivo.write( "Total de pessoas com o genero Feminino: " + generoF + "\n");
        arquivo.close();

        FileReader fileReader = new FileReader(caminhoArquivo);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linha;
        while ((linha = bufferedReader.readLine()) != null) {
            System.out.println(linha);
        }

     }

    private static List<UserDTO> convertJsonToUserDTOList(String json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, new TypeReference<List<UserDTO>>() {});
    }
}
