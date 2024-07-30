import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AudioTrackTest {

    @Test
    public void testPlay() {
        AudioTrack track = new AudioTrack("Test Song", "Test Artist", 180);
        track.play();
    }

    @Test
    public void testToString() {
        AudioTrack track = new AudioTrack("Test Song", "Test Artist", 180);
        String expected = "AudioTrack{title='Test Song', artist='Test Artist', duration=180}";
        assertEquals(expected, track.toString());
    }
}
