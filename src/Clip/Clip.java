package Clip;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.InputStream;

public class Clip {

    private javax.sound.sampled.Clip clip;

    public enum Skill {
        SKILL1("/clip/SKILL1.wav"),
        SKILL2("/clip/SKILL2.wav"),
        SKILL3("/clip/SKILL3.wav");

        public final String path;

        Skill(String path) {
            this.path = path;
        }
    }

    public void play(Skill skill) {
        try {
            // Stop current sound if playing
            if (clip != null && clip.isRunning()) {
                clip.stop();
                clip.close();
            }

            // Load audio file
            InputStream audioSrc = getClass().getResourceAsStream(skill.path);

            if (audioSrc == null) {
                System.out.println("Sound not found: " + skill.path);
                return;
            }

            InputStream bufferedIn = new BufferedInputStream(audioSrc);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);

            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}