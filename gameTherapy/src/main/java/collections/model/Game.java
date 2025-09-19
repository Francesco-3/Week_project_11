package collections.model;

import java.util.Objects;

public abstract class Game {
    private final String id; // aggiungo il final perchè l'id non può essere nullo o vuoto
    private int releaseYear;
    private double price;

    public Game(String id, int releaseYear, double price) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("L'ID non può essere vuoto");
        }
        this.id = id;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    // getter e setter per il prezzo
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id='" + id + '\'' +
                ", releaseYear=" + releaseYear +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return releaseYear == game.releaseYear &&
                Double.compare(price, game.price) == 0 &&
                Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, releaseYear, price);
    }
}
