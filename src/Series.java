import java.util.ArrayList;

public class Series extends Media {
    private ArrayList<Season> seasons;

    public Series(String title, ArrayList<String> actors) {
        super(title, actors);
        this.seasons = new ArrayList<>();
    }

    public int calculateEpisodes() {
        int totalepisodes = 0;
            for (Season season : seasons) {
                totalepisodes += season.getEpisodeCount();
            }
        System.out.println("Serien " + getTitle() + " har " + totalepisodes + " afsnit.");
        return totalepisodes;
    }

    public void addSeason(Season season) {
        seasons.add(season);
    }

    public ArrayList<Season> getSeasons() {
        return seasons;
    }

    public Episode getEpisode(int seasonNumber, int episodeNumber) {
        if (seasonNumber < 1 || seasonNumber > seasons.size()) {
            return null;
        }
        return seasons.get(seasonNumber - 1).getEpisode(episodeNumber);
    }

    @Override
    public String getInfo() {
        return getTitle() + " med " + String.join(", ", actors);
    }
}