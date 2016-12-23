package beatMonster.skill;

public class Freeze implements Skill {
    @Override
    public double enlargeRate() {
        return 1.3;
    }

    @Override
    public double decreaseRate() {
        return 0.8;
    }
}
