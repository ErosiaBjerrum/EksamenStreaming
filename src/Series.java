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
        System.out.println("The series " + getTitle() + " has " + totalepisodes + " episodes.\n");
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
        return getTitle() + " with " + String.join(" and ", actors) + "\n";
    }
}