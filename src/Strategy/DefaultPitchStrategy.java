package Strategy;

public class DefaultPitchStrategy implements PitchStrategy{

	@Override
	public int modifyPitch(int note) {
		return note;
	}

}
