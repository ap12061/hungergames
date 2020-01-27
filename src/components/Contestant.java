package components;

public class Contestant {
    private double attackLevel;
    private double healthLevel;

    public void setAttackLevel(double attackLevel) {
        this.attackLevel = attackLevel;
    }

    public void setHealthLevel(double healthLevel) {
        this.healthLevel = healthLevel;
    }

    public void setDefenseLevel(double defenseLevel) {
        this.defenseLevel = defenseLevel;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public double getAttackLevel() {
        return attackLevel;
    }

    public double getHealthLevel() {
        return healthLevel;
    }

    public double getDefenseLevel() {
        return defenseLevel;
    }

    public String getGender() {
        return gender;
    }

    public boolean isLife() {
        return life;
    }

    private double defenseLevel;
    private String name;
    private String gender;
    private boolean life = true;

    public Contestant(String name, double attackLevel, double healthLevel, double defenseLevel) {
        this.attackLevel = attackLevel;
        this.defenseLevel = defenseLevel;
        this.healthLevel = healthLevel;
    }

    public Contestant() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void decideGender() {
        if (Math.random() > 0.5) this.gender = "MALE";
        else this.gender = "FEMALE";
    }

    public void decideDeath() {
        if (healthLevel <= 0) {
            life = false;
        }
    }
}
