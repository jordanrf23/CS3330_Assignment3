package midiEventFactory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;

public class StaccatoFactory implements MidiEventFactory{

	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		
		return new StandardFactory().createNoteOn(tick, note, velocity, channel);

	}

	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		
		return new StandardFactory().createNoteOff(tick + 20, note, channel);
		
	}

}
