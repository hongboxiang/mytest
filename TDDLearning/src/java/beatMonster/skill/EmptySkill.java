package beatMonster.skill;

public class EmptySkill implements Skill {
    @Override
    public double enlargeRate() {
        return 1;
    }

    @Override
    public double decreaseRate() {
        return 1;
    }
}
