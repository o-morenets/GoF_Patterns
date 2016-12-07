package structural.adapter.mediaPlayer;

/**
 * Created by user on 06.11.2014.
 */
public class AdapterExample {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Thunderstruck.mp3");
        audioPlayer.play("mp4", "Matrix II.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "Birthday.avi");
    }
}
