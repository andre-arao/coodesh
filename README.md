# Desafios Coodesh

## Ferramentas usadas 
    
- Java 17
- Maven 
- Mysql ou PostgreSQL

## Execução de tasks
- Em sua IDE de preferencia execute a task desejada para testar o funcionamento e acompanhe o log.
- Para rodar a API da Task 5 entre via terminal na raiz do modulo [task5](./task5) e execute o comando a baixo.

      mvn clean install && java -jar target/task5-3.2.5.jar

## Informações extras

- [Sobre André Arão](./sobreAndreArao.txt)
- [Collection Postman da TASK5](./postman/codesh.postman_collection.json)
- [Análise do grafico](./graficos)
- URL de todos os endpoints: localhost:8080/codesh/employees
- Os testes e apresentação da API Rest da TASK5 estão em [video](./video/video-task5.mp4)

# Evidências

## TASK 1 
- Task here is to implement a function that says if a given string is palindrome.
Definition=> A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward as forward, such as madam or racecar.
![Captura de tela de 2024-04-23 09-35-28](https://github.com/andre-arao/coodesh/assets/99445336/b4ddc36e-dbf3-4e56-9367-fbfac0cc938c)

## TASK 2
- Task here is to write a list. Each element must know the element before and
 after it. Print out your list and them remove the element in the middle of
 the list. Print out again.
![Captura de tela de 2024-04-23 10-57-48](https://github.com/andre-arao/coodesh/assets/99445336/e823c6fb-5c4d-4ae5-ad1c-d916aa7264cd)

## TASK 3
- Write a list and add an aleatory number of Strings. In the end, print out how
 many distinct itens exists on the list.
![Captura de tela de 2024-04-23 13-16-38](https://github.com/andre-arao/coodesh/assets/99445336/38285860-aab5-4934-b1fa-74aae908a0b6)

## TASK 4
- Create an implementation of a Rest API client.
Prints out how many records exists for each gender and save this file to s3 bucket
API endpoint=> https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda AWS s3 bucket => interview-digiage
![Captura de tela de 2024-04-24 09-04-41](https://github.com/andre-arao/coodesh/assets/99445336/c92a1858-2d37-46b3-890f-1c1a538b3fb2)

## TASK 5
- Create an implementation of a Rest API .
 Expose an API. Feel free to explore possibilities/functionalities/capabilities following Rest standard.
 We suggest that your implementation have at least a CRUD scenario.
![Captura de tela de 2024-04-25 10-47-12](https://github.com/andre-arao/coodesh/assets/99445336/29607cc1-fb77-43dc-bb50-eac6bfe16224)

- OBS: O restante dos testes feito na API Rest está em [video](./video/video-task5.mp4)

## SQL 1
- Query que retorna a quantidade de funcionários separados por sexo:

      SELECT gender, COUNT(*) AS quantidade FROM result_test_guilherme GROUP BY gender;

![Captura de tela de 2024-04-25 09-41-17](https://github.com/andre-arao/coodesh/assets/99445336/6e79503e-79d4-463b-bb85-338136eaeb44)

## SQL 2
- Query que retorna a quantidade de funcionários distintos por sexo, ano de contratação e ano de nascimento:

      SELECT gender,
       EXTRACT(YEAR FROM birth_date) AS ano_nascimento,
       EXTRACT(YEAR FROM hire_date) AS ano_contratacao,
       COUNT(DISTINCT emp_no) AS quantidade
      FROM result_test_guilherme GROUP BY gender, ano_nascimento, ano_contratacao;
  
![Captura de tela de 2024-04-25 09-46-29](https://github.com/andre-arao/coodesh/assets/99445336/2484cf4b-c873-43df-ab34-412ac0c11e40)

## SQL 3
- Query que retorna a média, min e max de sálario por sexo:

      SELECT gender,
        AVG(salary) AS media_salario,
        MIN(salary) AS salario_minimo,
        MAX(salary) AS salario_maximo FROM result_test_guilherme
      GROUP BY gender;
  
![Captura de tela de 2024-04-25 09-48-03](https://github.com/andre-arao/coodesh/assets/99445336/cac09295-b074-41ac-88db-89163902e22b)
