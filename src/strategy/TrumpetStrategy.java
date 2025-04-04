package strategy;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class TrumpetStrategy implements InstrumentStrategy{
	
	
	/*
	 * changes the instrument to trumpet by going to 56, 0
	 */
	@Override
	public void applyInstruments(Track track, int channel) throws InvalidMidiDataException {
		ShortMessage instrumentChange = new ShortMessage();
		instrumentChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 56, 0);
		track.add(new MidiEvent(instrumentChange, 0));
		
		
	}

}
