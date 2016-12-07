package structural.adapter.mediaPlayer;

/**
 * Created by user on 06.11.2014.
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 format. File name: " + fileName);
    }
}
