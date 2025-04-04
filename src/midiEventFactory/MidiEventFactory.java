package midiEventFactory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;

public interface MidiEventFactory {
	
	/*
	 * method that will be used to force the note on
	 */
	MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
		
	/*
	 * method to force the note off
	 */
	MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException;

}
