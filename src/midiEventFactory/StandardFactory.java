package midiEventFactory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class StandardFactory implements MidiEventFactoryAbstract, MidiEventFactory{

	
	/*
	 * method used to have the note be on, standard
	 */
	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		try {
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
		return new MidiEvent(message, tick);
	} catch (InvalidMidiDataException e) {
		e.printStackTrace();
		throw e;
	}
	}

	/*
	 * method used to have the note be off, standard
	 */
	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		try {
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.NOTE_OFF, channel, note, 0);
		return new MidiEvent(message, tick);
	} catch (InvalidMidiDataException e) {
		e.printStackTrace();
		throw e;
	}
	}

	/*
	 * creates a new factory for standard
	 */
	@Override
	public MidiEventFactory createFactory() {
		return new StandardFactory();
	}

}
