import java.util.ArrayList;

public abstract class Media {
    private String title;
    ArrayList<String> actors;

    public Media(String title, ArrayList<String> actors) {
        this.title = title;
        this.actors = actors;
    }

    public void addActor(String actor) {
        actors.add(actor);
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public abstract String getInfo();
}