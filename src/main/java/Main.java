public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        AudioTrack audioTrack1 = new AudioTrack("Song A", "Artist A", 180);
        AudioTrack audioTrack2 = new AudioTrack("Song B", "Artist B", 200);
        Video video1 = new Video("Movie A", "Director A", 5400);
        Video video2 = new Video("Movie B", "Director B", 7200);

        mediaPlayer.addPlayable(audioTrack1);
        mediaPlayer.addPlayables(audioTrack2, video1, video2);

        mediaPlayer.playAll();
    }
}
