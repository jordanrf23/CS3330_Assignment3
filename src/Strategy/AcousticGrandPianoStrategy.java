package Strategy;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class AcousticGrandPianoStrategy implements InstrumentStrategy{

	@Override
	public void applyInstruments(Track track, int channel) {
		try {
			track.add(new MidiEvent(new ShortMessage(ShortMessage.PROGRAM_CHANGE, channel, 0, 0), 0));
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
	}

}
