package beatMonster.player;

/**
 * Created by 10180885 on 16-5-6.
 */
public class Archmage extends Player {
	public Archmage(int rank) {
		super(rank);
	}

	@Override
	public double getFighting() {
		return rank*1.5;
	}
}
