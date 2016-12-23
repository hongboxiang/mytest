package beatMonster.player;

/**
 * Created by 10180885 on 16-5-13.
 */
public class PlayerFactory {
	public static Archmage archmage(int rank) {
		return new Archmage(rank);
	}

	public static Soldier soldier(int rank) {
		return new Soldier(rank);
	}

}
