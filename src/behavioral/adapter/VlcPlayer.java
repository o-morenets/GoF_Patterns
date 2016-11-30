package behavioral.adapter;

/**
 * Created by user on 06.11.2014.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VCL format. File name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
