public class Kogtevran extends Hogwards {
    private int cleverness;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String name,
                     int magic,
                     int transgenerate,
                     int cleverness,
                     int wisdom,
                     int wit,
                     int creativity) {
        super(name, magic, transgenerate);
        this.cleverness = cleverness;
        this.wit = wit;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public int ability() {
        return cleverness + wisdom + wisdom + creativity;
    }

    public void compareKogtevran(Kogtevran kogtevran) {
        int ability1 = ability();
        int ability2 = kogtevran.ability();
        if (ability1 > ability2) {
            System.out.printf("Когтевранец %s лучше, чем Когтевранец %s: %d VS %d%n",
                    getName(),
                    kogtevran.getName(),
                    ability1,
                    ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Когтевранец %s лучше, чем Когтевранец %s: %d VS %d%n",
                    getName(),
                    kogtevran.getName(),
                    ability2,
                    ability1);
        } else {
            System.out.printf("Когтевранец %s такой же, как Когтевранец %s: %d VS %d%n",
                    getName(),
                    kogtevran.getName(),
                    ability1,
                    ability2);

        }
    }
    @Override
    public String toString() {
        return String.format("%s; ум: %d; мудрость: %d; сообразительность: %d; творчество: %d",
                super.toString(),
                cleverness,
                wit,
                wisdom,
                creativity);
    }
}
