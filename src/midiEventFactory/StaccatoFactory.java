package midiEventFactory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class StaccatoFactory implements MidiEventFactory, MidiEventFactoryAbstract{

	/*
	 * creates note on for Staccato
	 */
	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
		return new MidiEvent(message, tick);

	}

	/*
	 * creates note off for Staccato
	 */
	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.NOTE_OFF, channel, note, 120);
		return new MidiEvent(message, tick);
		
	}

	/*
	 * new factory for Staccato
	 */
	@Override
	public MidiEventFactory createFactory() {
		return new StaccatoFactory();
	}

}
