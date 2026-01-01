public class Episode implements Playable {
    private int episodeNumber;
    private String title;
    private int seasonNumber;
    private String seriesTitle;

    public Episode(int episodeNumber, String title, int seasonNumber, String seriesTitle) {
        this.episodeNumber = episodeNumber;
        this.title = title;
        this.seasonNumber = seasonNumber;
        this.seriesTitle = seriesTitle;
    }

    public void play() {
        System.out.println(
                "Afspiller: " +seriesTitle + " | Sæson " + seasonNumber + " | Episode " + episodeNumber + ": " + title);
    }
}