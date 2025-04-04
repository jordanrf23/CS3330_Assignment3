package strategy;

public class CustomPitchStrategy implements PitchStrategy {
	
	private final int basePitch;
	
	
	/*
	 * takes a pitch from the user 
	 */
	public CustomPitchStrategy(int basePitch) {
		this.basePitch = basePitch;
	}
	
	/*
	 * implements the pitch the user gave and sets it to the note
	 */
	@Override
	public int modifyPitch(int note) {
		return basePitch;
	}

}
