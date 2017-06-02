package beatMonster.skill;

public class Storm implements Skill {
    @Override
    public double enlargeRate() {
        return 1.5;
    }

    @Override
    public double decreaseRate() {
        return 1;
    }
}
