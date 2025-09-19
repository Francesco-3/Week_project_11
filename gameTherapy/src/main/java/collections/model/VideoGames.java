package collections.model;

import java.util.Objects;

public class VideoGames extends Game {
    private String platform;
    private int playTimeHours;
    private Genre genre;

    public VideoGames(String id, int releaseYear, double price, String platform, int playTimeHours, Genre genre) {
        super(id, releaseYear, price);
        this.platform = platform;
        this.playTimeHours = playTimeHours;
        this.genre = genre;
    }

    // getter e setter della piattaforma
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    // getter e setter della durata di gioco in ore
    public int getPlayTimeHours() {
        return playTimeHours;
    }
    public void setPlayTimeHours(int playTimeHours) {
        this.playTimeHours = playTimeHours;
    }

    // getter e setter del genere
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "id = '" + getId() + '\'' +
                ", anno di produzione = '" + getReleaseYear() +
                "', prezzo = '" + getPrice() +
                "', piattaforma = '" + platform +
                "', tempo di gioco = '" + playTimeHours +
                "h', genere = '" + genre +
                "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (getClass() != o.getClass()) return false;
        VideoGames that = (VideoGames) o;
        return playTimeHours == that.playTimeHours &&
                Objects.equals(platform, that.platform) &&
                genre == that.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), platform, playTimeHours, genre);
    }
}