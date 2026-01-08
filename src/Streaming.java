import java.util.ArrayList;

public class Streaming {
    private String name;
    private ArrayList<Movie> movies = new ArrayList<>();
    private ArrayList<Series> series = new ArrayList<>();

    public Streaming(String name) {
        this.name = name;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addSeries(Series serie) {
        series.add(serie);
    }

    public Movie getMovie(String title) {
        for (Movie m : movies) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                return m;
            }
        }
        return null;
    }

    public Episode getEpisode(String title, int seasonNumber, int episodeNumber) {
        for (Series s : series) {
            if (s.getTitle().equalsIgnoreCase(title)) {
                return s.getEpisode(seasonNumber, episodeNumber);
            }
        }
        return null;
    }


    public Series getSeries(String title) {
        for (Series s : series) {
            if (s.getTitle().equalsIgnoreCase(title)) {
                return s;
            }
        }
        return null;
    }
}