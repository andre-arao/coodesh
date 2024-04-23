package com.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 *
 *
 * Task here is to implement a function that says if a given string is
 * palindrome.
 *
 *
 *
 * Definition=> A palindrome is a word, phrase, number, or other sequence of
 * characters which reads the same backward as forward, such as madam or
 * racecar.
 */
public class TASK1 {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("madam", "racecar", "xpto", "uva", "amor a roma", "testando");
        String umaPalavra = "";
        String palavraContrario = "";

        for (int i = 0; i < palavras.size(); i++) {
            umaPalavra = palavras.get(i);
            for (int ii = 0; ii < umaPalavra.length(); ii++) {
                palavraContrario = umaPalavra.charAt(ii) + palavraContrario;

            }

            if (umaPalavra.equals(palavraContrario)){
                System.out.println(umaPalavra + ": VERDADEIRO, isso é um Palíndromo");
                System.out.println();
            } else {
                System.out.println(umaPalavra + ": FALSO, isso não é um Palíndromo");
                System.out.println();
            }
            palavraContrario = "";
        }

    }


}