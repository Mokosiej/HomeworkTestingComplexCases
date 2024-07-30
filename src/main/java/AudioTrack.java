public class AudioTrack implements Playable {
    private String title;
    private String artist;
    private int duration; // in seconds

    public AudioTrack(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Playing audio track: " + title + " by " + artist);
    }

    @Override
    public String toString() {
        return "AudioTrack{title='" + title + "', artist='" + artist + "', duration=" + duration + "}";
    }
}

