package Strategy;

public class LowerPitchStrategy implements PitchStrategy{

	@Override
	public int modifyPitch(int note) {
		// TODO Auto-generated method stub
		return note - 2;
	}

}
