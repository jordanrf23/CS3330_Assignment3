package strategy;

import javax.sound.midi.InvalidMidiDataException;

public class RaisePitchStrategy implements PitchStrategy{

	/*
	 * takes the note and modifies it by taking it up 2
	 */
	@Override
	public int modifyPitch(int note) throws InvalidMidiDataException {
		// TODO Auto-generated method stub
		return note + 2;
	}

	
}
