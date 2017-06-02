package beatMonster.skill;

public class Fire implements Skill {
    @Override
    public double enlargeRate() {
        return 1.2;
    }

    @Override
    public double decreaseRate() {
        return 0.9;
    }
}
