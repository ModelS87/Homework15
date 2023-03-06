public abstract class Hogwards {
    private String name;
    private int magic;
    private int transgenerate;

    public Hogwards(String name, int magic, int transgenerate) {
        this.name = name;
        this.magic = magic;
        this.transgenerate = transgenerate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgenerate() {
        return transgenerate;
    }

    public void setTransgenerate(int transgenerate) {
        this.transgenerate = transgenerate;
    }
    private int ability() {
        return magic + transgenerate;
    }
    public void compareHogwards(Hogwards hogwards) {
        int ability1 = ability();
        int ability2 = hogwards.ability();
        if (ability1>ability2) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", getName(),
                    hogwards.getName(), ability1, ability2);
        } else if (ability2>ability1) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", getName(),
                    hogwards.getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же, как студент %s: %d VS %d%n",
                    getName(),
                    hogwards.getName(),
                    ability1,
                    ability2
            );
        }
    }
    public void print() {
    System.out.println(this);
    }
    @Override
    public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d",
                name,
                magic,
                transgenerate);
    }
}

