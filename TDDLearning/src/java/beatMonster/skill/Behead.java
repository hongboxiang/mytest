package beatMonster.skill;

/**
 * Created by 10180885 on 16-6-2.
 */
public class Behead implements Skill{
	@Override
	public double enlargeRate() {
		return 1.8;
	}

	@Override
	public double decreaseRate() {
		return 1;
	}
}
