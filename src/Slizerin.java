public class Slizerin extends Hogwards {
    public int cunning;
    public int determination;
    public int ambition;
    public int ingenuity;
    public int thirstForPower;

    public Slizerin(String name,
                    int magic,
                    int transgenerate,
                    int cunning,
                    int determination,
                    int ambition,
                    int ingenuity,
                    int thirstForPower) {
        super(name, magic, transgenerate);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int ability() {
        return cunning + determination + ambition + ingenuity + thirstForPower;
    }

    public void compareSlizerin(Slizerin slizerin) {
        int ability1 = ability();
        int ability2 = slizerin.ability();
        if (ability1 > ability2) {
            System.out.printf("Слизеринец %s лучше, чем Слизеринец %s: %d VS %d%n",
                    getName(),
                    slizerin.getName(),
                    ability1,
                    ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Слизеринец %s лучше, чем Слизеринец %s: %d VS %d%n",
                    getName(),
                    slizerin.getName(),
                    ability2,
                    ability1);
        } else {
            System.out.printf("Слизеринец %s такой же, как Слизеринец %s: %d VS %d%n",
                    getName(),
                    slizerin.getName(),
                    ability1,
                    ability2);

        }
    }
    @Override
    public String toString() {
        return String.format("%s; хитрость: %d; решительность: %d; амбициозность: %d; находчивость: %d; жажда власти: %d",
                super.toString(),
                cunning,
                determination,
                ambition,
                ingenuity,
                thirstForPower
        );
    }
}
