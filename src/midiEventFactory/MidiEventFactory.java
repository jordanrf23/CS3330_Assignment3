package midiEventFactory;

public interface MidiEventFactory {
	
	MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
	
	

}
