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
                totalepisodes += season.getEpisodes().size();
            }
        System.out.println("Serien " + getTitle() + " har " + totalepisodes + " afsnit.");
        return totalepisodes;
    }

    public void getInfo() {
        System.out.println(getTitle() + " med " + String.join(", ", actors));
    }

    public void addSeason(Season season) {
        seasons.add(season);
    }

    public ArrayList<Season> getSeasons() {
        return seasons;
    }
}