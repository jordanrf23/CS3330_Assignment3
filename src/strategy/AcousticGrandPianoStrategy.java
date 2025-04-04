package strategy;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class AcousticGrandPianoStrategy implements InstrumentStrategy{

	
	/*
	 * when used with acoustic it will take the csv and set it to 0, 0
	 */
	@Override
	public void applyInstruments(Track track, int channel) throws InvalidMidiDataException {

		ShortMessage instrumentChange = new ShortMessage();
		instrumentChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 0, 0);
		track.add(new MidiEvent(instrumentChange, 0));
	}


}
