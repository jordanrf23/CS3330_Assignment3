package strategy;

import javax.sound.midi.InvalidMidiDataException;

public class LowerPitchStrategy implements PitchStrategy{

	@Override
	public int modifyPitch(int note) throws InvalidMidiDataException {
		// TODO Auto-generated method stub
		return note - 2;
	}
}
