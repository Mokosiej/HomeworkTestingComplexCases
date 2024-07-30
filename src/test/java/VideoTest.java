import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VideoTest {

    @Test
    public void testPlay() {
        Video video = new Video("Test Movie", "Test Director", 5400);
        video.play();
    }

    @Test
    public void testToString() {
        Video video = new Video("Test Movie", "Test Director", 5400);
        String expected = "Video{title='Test Movie', director='Test Director', duration=5400}";
        assertEquals(expected, video.toString());
    }
}
