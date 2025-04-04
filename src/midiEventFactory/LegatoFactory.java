package midiEventFactory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class LegatoFactory implements MidiEventFactory, MidiEventFactoryAbstract{

	/*
	 * creates note on for Legato 
	 */
	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
		return new MidiEvent(message, tick);
	}

	/*
	 * creates note off for Legato
	 */
	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.NOTE_OFF, channel, note, 80);
		return new MidiEvent(message, tick);
	}
	/*
	 * creates a new factory for legato
	 */
	@Override
	public MidiEventFactory createFactory() {
		return new LegatoFactory();
	}

}
