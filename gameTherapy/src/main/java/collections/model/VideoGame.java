package collections.model;

public class VideoGame extends Game {
    private String platform;
    private int durationHours;
    private Genre genre;

    public VideoGame(String id, int year, double price, String platform, int durationHours, Genre genre) {
        super(id, year, price);
        this.platform = platform;
        this.durationHours = durationHours;
        this.genre = genre;
    }

    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }

    public int getDurationHours() { return durationHours; }
    public void setDurationHours(int durationHours) { this.durationHours = durationHours; }

    public Genre getGenre() { return genre; }
    public void setGenre(Genre genre) { this.genre = genre; }

    @Override
    public String toString() {
        return "VideoGame{" +
                super.toString() +
                ", piattaforma='" + platform + '\'' +
                ", durataOre=" + durationHours +
                ", genere=" + genre +
                '}';
    }
}

