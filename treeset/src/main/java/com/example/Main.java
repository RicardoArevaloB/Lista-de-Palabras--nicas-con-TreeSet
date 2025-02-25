package com.example;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> palabras = new TreeSet<>();

        System.out.println("Ingrese varias palabras para terminar el programa escribe (fin): ");

        // 1. Pedir al usuario que ingrese varias palabras
        while (true) {
            System.out.print("Palabra: ");
            String palabra = scanner.nextLine();

            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }

            palabras.add(palabra);
        }

        System.out.println("\nLista de palabras ordenadas alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println("- " + palabra);
        }

        System.out.print("\nIngrese una palabra para buscar en la lista: ");
        String palabraBuscar = scanner.nextLine();

        if (palabras.contains(palabraBuscar)) {
            System.out.println("La palabra '" + palabraBuscar + "' SÍ está en la lista.");
        } else {
            System.out.println("La palabra '" + palabraBuscar + "' NO está en la lista.");
        }

        scanner.close();
    }
}