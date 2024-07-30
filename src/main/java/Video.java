public class Video implements Playable {
    private String title;
    private String director;
    private int duration; // in seconds

    public Video(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title + " directed by " + director);
    }

    @Override
    public String toString() {
        return "Video{title='" + title + "', director='" + director + "', duration=" + duration + "}";
    }
}


