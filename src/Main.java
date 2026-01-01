import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Streaming netflix = new Streaming();
        Scanner scanner = new Scanner(System.in);

        // MOVIES

        ArrayList<String> matrixActors = new ArrayList<>();
        matrixActors.add("Keanu Reeves");
        matrixActors.add("Laurence Fishburne");
        matrixActors.add("Carrie-Anne Moss");
        Movie matrix = new Movie("The Matrix", matrixActors, "The Wachowskis");

        ArrayList<String> gladiatorActors = new ArrayList<>();
        gladiatorActors.add("Russell Crowe");
        gladiatorActors.add("Joaquin Phoenix");
        Movie gladiator = new Movie("Gladiator", gladiatorActors, "Ridley Scott");

        ArrayList<String> interstellarActors = new ArrayList<>();
        interstellarActors.add("Matthew McConaughey");
        interstellarActors.add("Anne Hathaway");
        interstellarActors.add("Jessica Chastain");
        interstellarActors.add("Michael Caine");
        Movie interstellar = new Movie("Interstellar", interstellarActors, "Christopher Nolan");

        // SERIES

        Season s1 = new Season(1);
        Season s2 = new Season(2);
        Season s3 = new Season(3);

        // - Broen
        ArrayList<String> broenActors = new ArrayList<>();
        broenActors.add("Kim Bodnia");
        broenActors.add("Sofia Helin");

        Series broen = new Series("Broen", broenActors);

        Season broenS1 = new Season(1);
        broenS1.addEpisode(new Episode(1, "Pilot", 1, "Broen"));
        broenS1.addEpisode(new Episode(2, "The Swede", 1, "Broen"));

        Season broenS2 = new Season(2);
        broenS2.addEpisode(new Episode(1, "Danger Zone", 2, "Broen"));
        broenS2.addEpisode(new Episode(2, "Villains", 2, "Broen"));
        broenS2.addEpisode(new Episode(3, "Crossing the Bridge", 2, "Broen"));

        broen.addSeason(broenS1);
        broen.addSeason(broenS2);

        // - Homeland
        ArrayList<String> homelandActors = new ArrayList<>();
        homelandActors.add("Claire Danes");
        homelandActors.add("Damian Lewis");
        homelandActors.add("Mandy Patinkin");

        Series homeland = new Series("Homeland", homelandActors);

        Season homelandS1 = new Season(1);
        homelandS1.addEpisode(new Episode(1, "Pilot", 1, "Homeland"));
        homelandS1.addEpisode(new Episode(2, "Blind Trust", 1, "Homeland"));
        homelandS1.addEpisode(new Episode(3, "The Reckoning", 1, "Homeland"));

        Season homelandS2 = new Season(2);
        homelandS2.addEpisode(new Episode(1, "A New Beginning", 2, "Homeland"));
        homelandS2.addEpisode(new Episode(2, "Old Friends", 2, "Homeland"));
        homelandS2.addEpisode(new Episode(3, "The Safe House", 2, "Homeland"));
        homelandS2.addEpisode(new Episode(4, "Carrie Returns", 2, "Homeland"));

        homeland.addSeason(homelandS1);
        homeland.addSeason(homelandS2);

    netflix.addMedia(matrix);
    netflix.addMedia(gladiator);
    netflix.addMedia(interstellar);
    netflix.addMedia(broen);
    netflix.addMedia(homeland);

    String serietitel = "";
    int seasonnumber = 0;
    int episodenumber = 0;

    /*
        System.out.println("       === Velkommen til Netflix === \n" +
                "Hvad vil du se? Tryk 1 for film og 2 for serie.");
        int indholdsvalg = scanner.nextInt();
        scanner.nextLine();
        if (indholdsvalg == 2) {
            System.out.println("Skriv seriens titel.");
            serietitel = scanner.nextLine();
            System.out.println("Skriv sæsonnummer.");
            seasonnumber = scanner.nextInt() - 1;
            System.out.println("Skriv episodenummer.");
            episodenumber = scanner.nextInt() - 1;
        }

        broen.getSeasons().get(seasonnumber).getEpisodes().get(episodenumber).play();
        */


        broen.getInfo();
        System.out.println("");
        matrix.play();
        matrix.getInfo();
        broen.calculateEpisodes();
        homeland.calculateEpisodes();

    }
}