package pl.sdacademy;

public enum Genre {

    AFRICAN_HEAVY_METAL("Africa heavy metal"),
    EXPERIMENTAL_MUSIC("Experimental music"),
    ROCK("Rock"),
    POP("Pop"),
    CLASSIC("Classic"),
    DRUM_N_BASS("Drum N Bass");

    private String name;

    Genre(String name) {
        this.name = name;
    }
}
