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

    public Episode getEpisode(int episodeNumber) {
        if (episodeNumber < 1 || episodeNumber > episodes.size()) {
            return null;
        }
        return episodes.get(episodeNumber - 1);
    }


    public int getEpisodeCount() {
        return episodes.size();
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }
}