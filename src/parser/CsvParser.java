package parser;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.sound.midi.InvalidMidiDataException;
import eventdata.MidiEventData;

public class CsvParser {
	
	public static List<MidiEventData> parseCsv(String filePath) throws IOException, InvalidMidiDataException {
		List<MidiEventData> midiEvents = new ArrayList<>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			String line;
			boolean isFirstLine = true;
			while((line = reader.readLine()) != null) {
				if(isFirstLine) {
					isFirstLine = false;
					continue;
				}
				String[] values = line.split(" , ");
				if(values.length != 6) {
					continue;
				}
		
				int channel = Integer.parseInt(values[0].trim());
				String noteOnOffString = values[1].trim();
				int startEndTick = Integer.parseInt(values[2].trim());
				int note = Integer.parseInt(values[3].trim());
				int velocity = Integer.parseInt(values[4].trim());
				int instrument = Integer.parseInt(values[5].trim());
				
				int noteOnOff = 0;
				if("Note_on_c".equals(noteOnOffString)){
					noteOnOff = 1;
				}else if ("Note_off_c".equals(noteOnOffString)){
					noteOnOff = 0;
				}
	
				MidiEventData data = new MidiEventData(channel, note, startEndTick, noteOnOff, velocity, instrument);
				midiEvents.add(data);
			}
				
		}catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
		
		System.out.println("Parser completed");
		return (List<MidiEventData>) midiEvents;
	}

}
