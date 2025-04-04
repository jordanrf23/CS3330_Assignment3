package strategy;

import javax.sound.midi.InvalidMidiDataException;

public class LowerPitchStrategy implements PitchStrategy{
	
	
	/*
	 * takes the note and modifies it to go down 2
	 */
	@Override
	public int modifyPitch(int note) throws InvalidMidiDataException {
		// TODO Auto-generated method stub
		return note - 2;
	}
}
