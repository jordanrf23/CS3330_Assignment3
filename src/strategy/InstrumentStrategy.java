package strategy;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.Track;

public interface InstrumentStrategy {
	
	/*
	 * base method to be used by different instruments so they can sound proper
	 */
	void applyInstruments(Track track, int channel) throws InvalidMidiDataException;
	
	//electric bass guitar assigns midi instrument 33
	
	//trumpet strategy assigns midi instrument 56
	
	//acoustic grand piano strategy assigns midi instrument 0

}
