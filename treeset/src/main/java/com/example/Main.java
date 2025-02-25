package com.example;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            TreeSet<String> palabras = new TreeSet<>();

            System.out.println("Ingrese varias palabras para terminar el programa escribe (fin): ");

            while (true) {
                System.out.print("Palabra: ");
                String palabra = sc.nextLine();

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
            String palabraBuscar = sc.nextLine();

            if (palabras.contains(palabraBuscar)) {
                System.out.println("La palabra '" + palabraBuscar + "' SÍ está en la lista.");
            } else {
                System.out.println("La palabra '" + palabraBuscar + "' NO está en la lista.");
            }

            sc.close();
        }

    }
}