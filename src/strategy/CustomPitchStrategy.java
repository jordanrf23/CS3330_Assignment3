package strategy;

public class CustomPitchStrategy implements PitchStrategy {

	private final int basePitch;
	
	public CustomPitchStrategy(int basePitch) {
		this.basePitch = basePitch;
	}
	@Override
	public int modifyPitch(int note) {
		return basePitch;
	}

}
