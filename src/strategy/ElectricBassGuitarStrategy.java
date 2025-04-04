package strategy;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class ElectricBassGuitarStrategy implements InstrumentStrategy{

	
	/*
	 * when used electric will change the instrument to 33, 0
	 */
	@Override
	public void applyInstruments(Track track, int channel) throws InvalidMidiDataException {
		ShortMessage instrumentChange = new ShortMessage();
		instrumentChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 33, 0);
		track.add(new MidiEvent(instrumentChange, 0));
	}

}
