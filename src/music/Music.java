package nba.rumble;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.InputStream;

public class Music {

    public enum Track {
    MENU  ("/music/menu screen.wav"),
    FIGHT ("/music/fighting scene.wav"),
    LOOP  ("/music/loop.wav"),
    ROUND ("/music/round.wav");

        final String path;
        Track(String path) { this.path = path; }
    }

    private static Music instance;

    public static Music getInstance() {
        if (instance == null) instance = new Music();
        return instance;
    }

    private Music() {}

    private Clip    currentClip;
    private Track   currentTrack;

    public void play(Track track) {
        if (track == currentTrack && isPlaying()) return;
        startTrack(track, true);
    }

    public void playOnce(Track track) {
        startTrack(track, false);
    }

    public void stop() {
        if (currentClip != null) {
            currentClip.stop();
            currentClip.close();
            currentClip = null;
        }
        currentTrack = null;
    }
    public void forcePlay(Track track) {
    startTrack(track, true);
    }

    public boolean isPlaying() {
        return currentClip != null && currentClip.isRunning();
    }

    public Track getCurrentTrack() {
        return currentTrack;
    }

    public void dispose() {
        stop();
    }

    private void startTrack(Track track, boolean loop) {
        stop();
        try {
            InputStream raw = getClass().getResourceAsStream(track.path);
            if (raw == null) {
                System.err.println("File not found: " + track.path);
                return;
            }
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new BufferedInputStream(raw));
            currentClip = AudioSystem.getClip();
            currentClip.open(audioStream);
            if (loop) {
                currentClip.loop(Clip.LOOP_CONTINUOUSLY);
            } else {
                currentClip.start();
            }
            currentTrack = track;
        } catch (Exception e) {
            System.err.println("Error playing track: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Music music = Music.getInstance();

        music.play(Track.MENU);
        Thread.sleep(5000);

        music.play(Track.FIGHT);
        Thread.sleep(5000);

        music.playOnce(Track.ROUND);
        Thread.sleep(5000);

        music.stop();
    }
}
