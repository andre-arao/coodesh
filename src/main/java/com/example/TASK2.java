package com.example;

import com.example.listas.ListaDuplamenteEncadeada;

/**
 * Task here is to write a list. Each element must know the element before and
 * after it. Print out your list and them remove the element in the middle of
 * the list. Print out again.
 *
 */


public class TASK2 {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaencadeada = new ListaDuplamenteEncadeada<>();

        minhaListaencadeada.add("001");
        minhaListaencadeada.add("002");
        minhaListaencadeada.add("003");
        minhaListaencadeada.add("004");
        minhaListaencadeada.add("005");
        minhaListaencadeada.add("006");
        minhaListaencadeada.add("007");

        System.out.println(minhaListaencadeada);
        System.out.println("O conteudo da lista na posição 3 é o: " + minhaListaencadeada.get(3));

        System.out.println();

        minhaListaencadeada.remove(3);
        System.out.println(minhaListaencadeada);
        System.out.println("O conteudo da lista na posição 3 é o: " + minhaListaencadeada.get(3));

        minhaListaencadeada.add(3, "777");

        System.out.println();

        System.out.println(minhaListaencadeada);
        System.out.println("O conteudo da lista na posição 3 é o: " + minhaListaencadeada.get(3));

    }

}