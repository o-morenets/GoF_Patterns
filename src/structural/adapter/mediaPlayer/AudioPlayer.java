package structural.adapter.mediaPlayer;

/**
 * Created by user on 06.11.2014.
 */
public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType.toUpperCase()) {
            case "MP3":
                System.out.println("Playing MP3. File name: " + fileName);
                break;
            case "VLC":
            case "MP4":
                new MediaAdapter(audioType).play(audioType, fileName);
                break;
            default:
                System.out.println("Invalid media. Format not supported. File name: " + fileName);
        }
    }
}
