package org.example;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
    public static void play() {
        try{
            Sequencer sequencer = MidiSystem.getSequencer(); // wywolanie metody mogacej dac wyjate;
            System.out.println("Succesfully got a sequencer");
        } catch (MidiUnavailableException e) { // obsłużenie wyjątku
            System.out.println("Bummer");;
        }
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }


}
