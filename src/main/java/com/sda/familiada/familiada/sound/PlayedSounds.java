package com.sda.familiada.familiada.sound;

import java.io.File;
import javax.sound.sampled.*;

class PlayedSounds {
    public void cricket() {
        try {
            AudioInputStream file = AudioSystem.getAudioInputStream(new File("C:\\Users\\tommo\\IdeaProjects\\familiada\\src\\main\\resources\\audio\\cricket.wav"));
            Clip audio = AudioSystem.getClip();

            audio.open(file);
            audio.start();

            while (!audio.isRunning())
                Thread.sleep(10);
            while (audio.isRunning())
                Thread.sleep(10);

            audio.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void applause() {
        try {
            AudioInputStream file = AudioSystem.getAudioInputStream(new File("C:\\Users\\tommo\\IdeaProjects\\familiada\\src\\main\\resources\\audio\\applause.wav"));
            Clip audio = AudioSystem.getClip();

            audio.open(file);
            audio.start();

            while (!audio.isRunning())
                Thread.sleep(10);
            while (audio.isRunning())
                Thread.sleep(10);

            audio.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void goodAnswer() {
        try {
            AudioInputStream file = AudioSystem.getAudioInputStream(new File("C:\\Users\\tommo\\IdeaProjects\\familiada\\src\\main\\resources\\audio\\goodAnswer.wav"));
            Clip audio = AudioSystem.getClip();

            audio.open(file);
            audio.start();

            while (!audio.isRunning())
                Thread.sleep(10);
            while (audio.isRunning())
                Thread.sleep(10);

            audio.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void badAnswer() {
        try {
            AudioInputStream file = AudioSystem.getAudioInputStream(new File("C:\\Users\\tommo\\IdeaProjects\\familiada\\src\\main\\resources\\audio\\badAnswer.wav"));
            Clip audio = AudioSystem.getClip();

            audio.open(file);
            FloatControl soundControl = (FloatControl) audio.getControl(FloatControl.Type.MASTER_GAIN);
            soundControl.setValue(+5.0f);
            audio.start();

            while (!audio.isRunning())
                Thread.sleep(10);
            while (audio.isRunning())
                Thread.sleep(10);

            audio.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    public void thirdWrongAnswer() {
        try {
            AudioInputStream file = AudioSystem.getAudioInputStream(new File("C:\\Users\\tommo\\IdeaProjects\\familiada\\src\\main\\resources\\audio\\thirdwronganswer.wav"));
            Clip audio = AudioSystem.getClip();

            audio.open(file);
            audio.start();

            while (!audio.isRunning())
                Thread.sleep(10);
            while (audio.isRunning())
                Thread.sleep(10);

            audio.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void intro() {
        try {
            AudioInputStream file = AudioSystem.getAudioInputStream(new File("C:\\Users\\tommo\\IdeaProjects\\familiada\\src\\main\\resources\\audio\\intro.wav"));
            Clip audio = AudioSystem.getClip();

            audio.open(file);
            audio.start();

            while (!audio.isRunning())
                Thread.sleep(10);
            while (audio.isRunning())
                Thread.sleep(10);

            audio.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void outro() {
        try {
            AudioInputStream file = AudioSystem.getAudioInputStream(new File("C:\\Users\\tommo\\IdeaProjects\\familiada\\src\\main\\resources\\audio\\outro.wav"));
            Clip audio = AudioSystem.getClip();

            audio.open(file);
            audio.start();

            while (!audio.isRunning())
                Thread.sleep(10);
            while (audio.isRunning())
                Thread.sleep(10);

            audio.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}