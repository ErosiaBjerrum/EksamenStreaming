import java.util.ArrayList;

public class Movie extends Media implements Playable {
    private String director;

    public Movie(String title, ArrayList<String> actors, String director) {
        super(title, actors);
        this.director = director;
    }

    @Override
    public String getInfo() {
        return getTitle() + " with " + String.join(" and ", actors) + " and directed by " + director + "\n";
    }

    @Override
    public void play() {
        System.out.println("Playing: " + getTitle() + "\n");
    }
}