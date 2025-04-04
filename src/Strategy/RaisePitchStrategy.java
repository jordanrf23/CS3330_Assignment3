package Strategy;

import javax.sound.midi.InvalidMidiDataException;

public class RaisePitchStrategy implements PitchStrategy{

	@Override
	public int modifyPitch(int note) throws InvalidMidiDataException {
		// TODO Auto-generated method stub
		return note + 2;
	}

	
}
