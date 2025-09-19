package collections.model;

public class BoardGames extends Game {
    private int gamerNumber;
    private int durationAverageMinutes;

    public BoardGames(String id, int year, double price, int gamerNumber, int durationAverageMinutes) {
        super(id, year, price);
        if (gamerNumber < 2 || gamerNumber > 10) {
            throw new IllegalArgumentException("Numero giocatori deve essere tra 2 e 10");
        }
        this.gamerNumber = gamerNumber;
        this.durationAverageMinutes = durationAverageMinutes;
    }

    public int getGamerNumber() { return gamerNumber; }
    public void setGamerNumber(int gamerNumber) {
        if (gamerNumber < 2 || gamerNumber > 10) {
            throw new IllegalArgumentException("Numero giocatori deve essere tra 2 e 10");
        }
        this.gamerNumber = gamerNumber;
    }

    public int getDurationAverageMinutes() { return durationAverageMinutes; }
    public void setDurationAverageMinutes(int durationAverageMinutes) { this.durationAverageMinutes = durationAverageMinutes; }

    @Override
    public String toString() {
        return "BoardGame{" +
                super.toString() +
                ", gamerNumber=" + gamerNumber +
                ", durataMediaMinuti=" + durationAverageMinutes +
                '}';
    }
}

