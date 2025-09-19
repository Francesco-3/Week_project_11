package collections.model;

import java.util.Objects;

public class BoardGames extends Game {
    private int numberOfPlayers;
    private int averageDurationMinutes;

    public BoardGames(String id, int releaseYear, double price, int numberOfPlayers, int averageDurationMinutes) {
        super(id, releaseYear, price);
        if (numberOfPlayers < 2 || numberOfPlayers > 10) {
            throw new IllegalArgumentException("Il numero di giocatori deve essere tra 2 e 10");
        }
        this.numberOfPlayers = numberOfPlayers;
        this.averageDurationMinutes = averageDurationMinutes;
    }

    // getter e setter del numero di giocatori (compreso ovviamente tra 2 e 10)
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }
    public void setNumberOfPlayers(int numberOfPlayers) {
        if (numberOfPlayers < 2 || numberOfPlayers > 10) {
            throw new IllegalArgumentException("Il numero di giocatori deve essere tra 2 e 10");
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    // getter e setter della media della durata in minuti di una partita
    public int getAverageDurationMinutes() {
        return averageDurationMinutes;
    }
    public void setAverageDurationMinutes(int averageDurationMinutes) {
        this.averageDurationMinutes = averageDurationMinutes;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "id = '" + getId() +
                "', pubblicato il = '" + getReleaseYear() +
                "', prezzo = '" + getPrice() +
                "', numero di giocatori = '" + numberOfPlayers +
                "', durata media = '" + averageDurationMinutes +
                "min'}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (getClass() != o.getClass()) return false;
        BoardGames that = (BoardGames) o;
        return numberOfPlayers == that.numberOfPlayers &&
                averageDurationMinutes == that.averageDurationMinutes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfPlayers, averageDurationMinutes);
    }
}