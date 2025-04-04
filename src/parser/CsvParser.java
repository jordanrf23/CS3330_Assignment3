package parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;

import midiEventFactory.MidiEventFactory;
import eventdata.MidiEventData;

public class CsvParser {
	
	public List<MidiEventData> parseCsv(String filePath) throws IOException, InvalidMidiDataException {
		List<MidiEvent> midiEvents = new ArrayList<>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			String line;
			while((line = reader.readLine()) != null) {
				String[] values = line.split(" , ");
				if(values.length < 4) {
					throw new InvalidMidiDataException("Invalid number of fields in CSV row.");
				}
		
				int tick = Integer.parseInt(values[0].trim());
				int note = Integer.parseInt(values[1].trim());
				int velocity = Integer.parseInt(values[2].trim());
				int channel = Integer.parseInt(values[3].trim());
				String noteOnOff = values[4].trim();
				
			
	
				midiEvents.add(new MidiEventData(channel, note, tick, note, velocity, channel));
			}
				
		}catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
			
		return midiEvents;
	}

}
