package Strategy;

import javax.sound.midi.InvalidMidiDataException;

public interface PitchStrategy {
	
	int modifyPitch(int note) throws InvalidMidiDataException;
	
	//high pitch raises by 2 note
	//low pitch lowers by 2 note

}
