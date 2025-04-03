package Strategy;

public class RaisePitchStrategy implements PitchStrategy{

	
	@Override
	public int modifyPitch(int note) {
		return note + 2;
	}

}
