package collections;

import collections.model.*;
import collections.services.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CollectionManager manager = new CollectionManager();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- MENU COLLEZIONE GIOCHI ---");
            System.out.println("1. Aggiungi un gioco");
            System.out.println("2. Ricerca per ID");
            System.out.println("3. Ricerca per prezzo");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> manager.addGameFromInput(scanner);
                case 2 -> manager.findGameById(scanner);
                case 3 -> manager.findGamesByPrice(scanner);
                case 0 -> {
                    exit = true;
                    System.out.println("Uscita dal programma.");
                }
                default -> System.out.println("Scelta non valida!");
            }
        }

        scanner.close();
    }
}
