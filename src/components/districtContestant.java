package components;

public class districtContestant extends Contestant {
    double defenseIncrease;

    public districtContestant(String name, double attackLevel, double healthLevel, double defenseLevel, double defenseIncrease) {
        super(name, attackLevel, healthLevel, defenseLevel);
        this.defenseIncrease = defenseIncrease;
    }
}
