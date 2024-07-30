import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    private List<Playable> playlist;

    public MediaPlayer() {
        this.playlist = new ArrayList<>();
    }

    public void addPlayable(Playable playable) {
        playlist.add(playable);
    }

    public void addPlayables(Playable... playables) {
        for (Playable playable : playables) {
            playlist.add(playable);
        }
    }

    public List<Playable> getPlaylist() {
        return playlist;
    }

    public void playAll() {
        for (Playable playable : playlist) {
            playable.printInfo();
            System.out.println(playable.toString());
            playable.play();
            System.out.println();
        }
    }
}
