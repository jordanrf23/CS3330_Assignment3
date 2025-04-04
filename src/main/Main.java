package main;

import java.util.List;

import javax.sound.midi.Sequence;
import javax.sound.midi.Track;

import eventdata.MidiEventData;
import parser.CsvParser;
import midiEventFactory.*;

public class Main {

	public static void main(String[] args) {
		
		try {
			List<MidiEventData> midiEvents = CsvParser.parseCsv("./files/mystery-song.csv");
			Sequence sequence = new Sequence (Sequence.PPQ, 384);
			Track track = sequence.createTrack();
			
			MidiEventFactoryAbstract factoryAbstract = new StandardFactory();
		}
		

	}

}
