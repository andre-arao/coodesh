# Desafios Coodesh

## Ferramentas usadas 
    
- Java 17
- Maven 
- Mysql ou PostgreSQL

## Execução de tasks
- Em sua IDE de preferencia execute a task desejada para testar o funcionamento e acompanhe o log.
- Para rodar a API da Task 5 entre via terminal na raiz do modulo TASK5 e execute o comando a baixo.

      mvn clean install && java -jar target/task5-3.2.5.jar
- URL: localhost:8080/codesh/employees

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
![Captura de tela de 2024-04-24 14-03-47](https://github.com/andre-arao/coodesh/assets/99445336/162dad33-fabb-403a-b3df-3e6461602cb8)


- OBS: O usuario que foi passado (interview) para esse desafio não tem permissão de inserir, atualizar ou deletar um employees do banco. com isso só foi implementado o endpoint da API que lista os employees. Segue evidencia do erro a baixo ao mandar uma requisição POST de criação de um novo employees via postman.
![Captura de tela de 2024-04-24 13-32-59](https://github.com/andre-arao/coodesh/assets/99445336/6a7ec3e1-3534-46c9-8409-2124f9668417)
