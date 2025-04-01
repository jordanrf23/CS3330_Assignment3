package eventdata;

public class MidiEventData {
	
	//implement a CSV parser to read the file and return List¡MidiEventData¿
	//the CSV parser should read each line split the values by commas and create MidiEventData objects
	
	  private int channel;
	  private int note;
	  private int startEndTick;
	  private int noteOnOff;
	  private int velocity;
	  private int instrument;
	  
	  //Constructor 
	  public MidiEventData(int channel, int note, int startEndTick, int noteOnOff, int velocity, int instrument) {
		  this.channel = channel;
		  this.note = note;
		  this.startEndTick = startEndTick;
		  this.noteOnOff = noteOnOff;
		  this.velocity = velocity;
		  this.instrument = instrument; 
	  }

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public int getStartEndTick() {
		return startEndTick;
	}

	public void setStartEndTick(int startTick) {
		this.startEndTick = startTick;
	}

	public int getnoteOnOff() {
		return noteOnOff;
	}

	public void setnoteOnOff(int endTick) {
		this.noteOnOff = endTick;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public int getInstrument() {
		return instrument;
	}

	public void setInstrument(int instrument) {
		this.instrument = instrument;
	}
	  
	  //getters and setters 

}
