package strategy;

public class DefaultPitchStrategy implements PitchStrategy{

	
	/*
	 * no change will happen it is a default call
	 */
	@Override
	public int modifyPitch(int note) {
		return note;
	}

}
