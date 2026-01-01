import java.util.ArrayList;

public class Season {
    private ArrayList<Episode> episodes = new ArrayList<>();
    private int seasonNumber;

    public Season(int seasonNumber) {
        this.seasonNumber = seasonNumber;
        this.episodes = new ArrayList<>();
    }

    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }
}