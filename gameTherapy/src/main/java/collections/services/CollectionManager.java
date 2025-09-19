package collections.services;

import collections.model.*;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionManager {
    private Map<String, Game> gameMap;

    public CollectionManager() {
        gameMap = new HashMap<>();
    }

    public void addGame(Game game) {
        if (gameMap.containsKey(game.getId())) {
            System.out.println("\nErrore: esiste già un gioco con questo ID!\n");
            return;
        }

        gameMap.put(game.getId(), game);
        System.out.println("\nGioco aggiunto con successo: " + game.getId() + "\n");
    }

    public void addGameFromInput(Scanner scanner) {
        try {
            System.out.print("Seleziona il tipo di gioco da aggiungere: 1 = Videogioco, 2 = Gioco da Tavolo: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Inserisci ID del gioco: ");
            String id = scanner.nextLine();

            System.out.print("Inserisci anno di pubblicazione: ");
            int year = scanner.nextInt();

            System.out.print("Inserisci prezzo: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            Game game;

            if (choice == 1) {
                System.out.print("Inserisci piattaforma: ");
                String platform = scanner.nextLine();

                System.out.print("Inserisci durata di gioco in ore: ");
                int hours = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Inserisci genere: ");
                String genreStr = scanner.nextLine().toUpperCase();
                game = new VideoGames(id, year, price, platform, hours, Genre.valueOf(genreStr));

            } else if (choice == 2) {
                System.out.print("Inserisci numero di giocatori (2-10): ");
                int players = scanner.nextInt();

                System.out.print("Inserisci durata media della partita in minuti: ");
                int duration = scanner.nextInt();
                scanner.nextLine();

                game = new BoardGames(id, year, price, players, duration);

            } else {
                System.out.println("\nScelta non valida!\n");
                return;
            }

            addGame(game);

        } catch (InputMismatchException e) {
            System.out.println("\nErrore: input non valido!\n");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("\nErrore: " + e.getMessage() + "\n");
        }
    }

    public void findGameById(Scanner scanner) {
        System.out.print("Inserisci l'ID del gioco da cercare: ");
        String id = scanner.nextLine();

        Game game = gameMap.get(id);
        if (game != null) {
            System.out.println("\nGioco trovato: " + game);
        } else {
            System.out.println("\nErrore: nessun gioco trovato con questo ID!\n");
        }
    }

    public void findGamesByPrice(Scanner scanner) {
        try {
            System.out.print("Inserisci il prezzo massimo: ");
            double maxPrice = scanner.nextDouble();
            scanner.nextLine();

            List<Game> filteredGames = gameMap.values().stream().filter(game -> game.getPrice() <= maxPrice).collect(Collectors.toList());

            if (filteredGames.isEmpty()) {
                System.out.println("\nNessun gioco trovato con prezzo inferiore o uguale a " + maxPrice + "\n");
            } else {
                System.out.println("\nGiochi trovati:");
                filteredGames.forEach(System.out::println);
            }

        } catch (InputMismatchException e) {
            System.out.println("\nErrore: input non valido!");
            scanner.nextLine();
        }
    }
}