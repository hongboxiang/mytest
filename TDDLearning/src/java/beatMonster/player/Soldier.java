package beatMonster.player;

/**
 * Created by 10180885 on 16-5-6.
 */
public class Soldier extends Player {

	public Soldier(int rank) {
		super(rank);
	}

	@Override
	public double getFighting() {
		return rank;
	}
}
