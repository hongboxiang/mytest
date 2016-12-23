package beatMonster.skill;

public class SkillFactory {
    public static Skill behead() {
        return new Behead();
    }

    public static Skill storm() {
        return new Storm();
    }

    public static Skill fire() {
        return new Fire();
    }

    public static Skill freeze() {
        return new Freeze();
    }

}
