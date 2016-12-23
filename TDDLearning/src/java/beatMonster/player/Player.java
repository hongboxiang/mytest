package beatMonster.player;

import beatMonster.Role;
import beatMonster.monster.Monster;
import beatMonster.skill.EmptySkill;
import beatMonster.skill.Skill;

/**
 * Created by 10180885 on 16-5-12.
 */
public abstract class Player extends Role {

	private Skill skill;

	public Player(int rank) {
		super(rank);
		skill = new EmptySkill();
	}

	public boolean kill(Monster monster) {
		return this.fighting >= monster.getRank()*skill.decreaseRate();
	}

	public Player using(Skill skill) {
		this.fighting *= skill.enlargeRate();
		this.skill = skill;
		return this;
	}
}
