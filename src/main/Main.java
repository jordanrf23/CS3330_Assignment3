package main;

import java.util.List;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import eventdata.MidiEventData;
import parser.CsvParser;
import midiEventFactory.*;
import strategy.*;

public class Main {

	public static void main(String[] args) {
		
		try {
			List<MidiEventData> midiEvents = CsvParser.parseCsv("./files/mystery-song.csv");
			Sequence sequence = new Sequence (Sequence.PPQ, 384);
			Track track = sequence.createTrack();
			
			MidiEventFactoryAbstract factoryAbstract = new LegatoFactory();
			
			MidiEventFactory factory = factoryAbstract.createFactory();
			
			InstrumentStrategy instrumentStrategy = new AcousticGrandPianoStrategy();
			instrumentStrategy.applyInstruments(track, 0);
			instrumentStrategy = new ElectricBassGuitarStrategy();
			instrumentStrategy.applyInstruments(track, 1);
			
			PitchStrategy pitchStrategy = new RaisePitchStrategy();
			
			for (MidiEventData event : midiEvents) {
				int modifiedNote = pitchStrategy.modifyPitch(event.getNote());
				modifiedNote = pitchStrategy.modifyPitch(modifiedNote);
				
				if(event.getnoteOnOff() == ShortMessage.NOTE_ON) {
					track.add(factory.createNoteOn(event.getStartEndTick(), modifiedNote, event.getVelocity(), event.getChannel()));
				}else {
					track.add(factory.createNoteOff(event.getStartEndTick(), modifiedNote, event.getChannel()));
				}
			}
			
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.setSequence(sequence);
			sequencer.start();
			
			while(sequencer.isRunning() | sequencer.isOpen()) {
				Thread.sleep(100);
			}
			Thread.sleep(500);
			sequencer.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
