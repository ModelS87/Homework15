import java.util.Random;

public class Main {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Griffindor harry = generateGriffindor("Гарри Поттер");
        Griffindor ron = generateGriffindor("Рон Уизли");
        Kogtevran padme = generateKogtevran("Падма Патил");
        Slizerin draco = generateSlizerin("Драко Малфой");
        Puffendyi cedric = generatePuffendyi("Седрик Диггори");

        harry.print();
        ron.print();
        padme.print();
        draco.print();
        cedric.print();
        harry.compareHogwards(draco);
        harry.compareGriffindor(ron);
    }

    private static Griffindor generateGriffindor(String name) {
        return new Griffindor(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Puffendyi generatePuffendyi(String name) {
        return new Puffendyi(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Kogtevran generateKogtevran(String name) {
        return new Kogtevran(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Slizerin generateSlizerin(String name) {
        return new Slizerin(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}