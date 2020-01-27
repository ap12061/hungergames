package components;

public class careerContestant extends Contestant {
    double attackLevelIncrease;

    public careerContestant(String name, double attackLevel, double healthLevel, double defenseLevel, double attackLevelIncrease) {
        super(name, attackLevel, healthLevel, defenseLevel);
        this.attackLevelIncrease = attackLevelIncrease;
    }
}
