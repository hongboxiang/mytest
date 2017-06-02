package beatMonster.monster;

/**
 * Created by 10180885 on 16-5-13.
 */
public class MonsterFactory {
	public static Monster monster(int rank){
		return new Monster(rank);
	}
}
