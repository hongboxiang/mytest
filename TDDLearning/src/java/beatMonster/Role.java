package beatMonster;

/**
 * Created by 10180885 on 16-5-13.
 */
public abstract class Role {
	protected final int rank;
	protected double fighting;

	public Role(int rank) {
		this.rank = rank;
		this.fighting = getFighting();
	}

	public int getRank() {
		return rank;
	}

	public abstract double getFighting();
}
