import java.util.ArrayList;

public class Movie extends Media implements Playable {
    private String director;

    public Movie(String title, ArrayList<String> actors, String director) {
        super(title, actors);
        this.director = director;
    }

    public void getInfo() {
        System.out.println(getTitle() + " med " + String.join(", ", actors) + " og instrueret af " + director);
    }

    @Override
    public void play() {
        System.out.println("Afspiller: " + getTitle());
    }
}