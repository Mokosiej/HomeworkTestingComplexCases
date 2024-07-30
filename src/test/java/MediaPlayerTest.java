import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayerTest {
    private MediaPlayer mediaPlayer;
    private AudioTrack audioTrack;
    private Video video;

    @BeforeEach
    public void setUp() {
        mediaPlayer = new MediaPlayer();
        audioTrack = new AudioTrack("Test Song", "Test Artist", 180);
        video = new Video("Test Movie", "Test Director", 5400);
    }

    @Test
    public void testAddPlayable() {
        mediaPlayer.addPlayable(audioTrack);
        List<Playable> expected = new ArrayList<>();
        expected.add(audioTrack);
        assertEquals(expected, mediaPlayer.getPlaylist());
    }

    @Test
    public void testAddPlayables() {
        mediaPlayer.addPlayables(audioTrack, video);
        List<Playable> expected = new ArrayList<>();
        expected.add(audioTrack);
        expected.add(video);
        assertEquals(expected, mediaPlayer.getPlaylist());
    }

    @Test
    public void testPlayAll() {
        mediaPlayer.addPlayables(audioTrack, video);
        mediaPlayer.playAll();
    }
}
