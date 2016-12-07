package structural.adapter.mediaPlayer;

/**
 * Created by user on 06.11.2014.
 */
public class MediaAdapter implements MediaPlayer {
    public MediaAdapter(String audioType) {

    }

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType.toUpperCase()) {
            case "VLC": new VlcPlayer().playVlc(fileName);
                break;
            case "MP4": new Mp4Player().playMp4(fileName);
        }
    }
}
