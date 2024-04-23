package com.example;

import java.util.*;

/**
 * Write a list and add an aleatory number of Strings. In the end, print out how
 * many distinct itens exists on the list.
 *
 */
public class TASK3 {

    public static void main(String[] args) {
        List<String> aleatorios = Arrays.asList("xpto", "andre", "arao", "arao", "bom dia", "ok", "ok", "nice", "bom dia", "hello");

        Set<String> itensDistintos = new HashSet<>();
        Set<String> elementosRemovidos = new HashSet<>();

        for (String elemento : aleatorios) {
            if (!itensDistintos.add(elemento)) {
                elementosRemovidos.add(elemento);
                itensDistintos.removeAll(elementosRemovidos);
            }
        }

        System.out.println("Lista: " + aleatorios);
        System.out.println();
        System.out.println("Número de itens distintos na lista: " + itensDistintos.size());
    }

}