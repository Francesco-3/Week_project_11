package collections.model;

import java.util.Objects;
public class Game {
    private final String id;      // codice univoco
    private int yearOfPublication;
    private double price;

    public Game(String id, int yearOfPublication, double price) {
        this.id = Objects.requireNonNull(id, "ID non può essere null");
        this.yearOfPublication = yearOfPublication;
        this.price = price;
    }

    public String getId() { return id; }
    public int getYearOfPublication() { return yearOfPublication; }
    public void setYearOfPublication(int yearOfPublication) { this.yearOfPublication = yearOfPublication; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;
        Game game = (Game) o;
        return id.equals(game.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return String.format("ID=%s, Anno=%d, Prezzo=%.2f €", id, yearOfPublication, price);
    }
}
