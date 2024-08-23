public class Main {
    public static void main(String[] args) {

        Gryffindor[] gryffindor = {
                new Gryffindor("Поттер", "Гарри", 10, 20, 30, 40, 50),
                new Gryffindor("Грейнджер", "Гермиона", 20, 30, 40, 50, 60),
                new Gryffindor("Уизли", "Рон", 30, 40, 50, 60, 70)
        };

        Slytherin[] slytherins = {
                new Slytherin("Малфой", "Драко", 40, 50, 60, 70, 80, 90, 100),
                new Slytherin("Монтегю", "Грэхэм", 50, 60, 70, 80, 90, 100, 10),
                new Slytherin("Гойл", "Грегори", 60, 70, 80, 90, 100, 10, 20)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Смит", "Захария", 70, 80, 90, 100, 10),
                new Hufflepuff("Диггори", "Седрик", 80, 90, 100, 10, 20),
                new Hufflepuff("Финич-Флетчли", "Джастин", 90, 100, 10, 20, 30),
        };

        Ravencraw[] ravencraws = {
                new Ravencraw("Чанг", "Чжоу", 100, 10, 20, 30, 40, 50),
                new Ravencraw("Патил", "Падма", 10, 20, 30, 40, 50, 60),
                new Ravencraw("Белби", "Маркус", 20, 30, 40, 50, 60, 70),
        };

        PrintService.print(gryffindor);
        PrintService.print(slytherins);
        PrintService.print(hufflepuffs);
        PrintService.print(ravencraws);

        topHogwarts(gryffindor[0],gryffindor[2]);
        topSlytherin(slytherins[1],slytherins[2]);
        topHufflepuff(hufflepuffs[0],hufflepuffs[2]);
        topRavencraw(ravencraws[2],ravencraws[0]);

        topStudent(gryffindor[1],slytherins[2]);

    }

    public static void topHogwarts(Gryffindor st1, Gryffindor st2) {
        int student1 = st1.getHonor() + st1.getBravery() + st1.getNobility();
        int student2 = st2.getHonor() + st2.getBravery() + st2.getNobility();
        if (student1 > student2) {
            System.out.println("Студент " + st1 + " лучше чем " + st2);
        } else {
            System.out.println("Студент " + st2 + " лучше чем " + st1);
        }
        System.out.println(" ");
    }
    public static void topSlytherin(Slytherin st1, Slytherin st2) {
        int student1 = st1.getAmbition() + st1.getCunning() + st1.getResourcefulness() + st1.getDetermination() + st1.getThirstPower();
        int student2 = st2.getAmbition() + st2.getCunning() + st2.getResourcefulness() + st2.getDetermination() + st2.getThirstPower();
        if (student1 > student2) {
            System.out.println("Студент " + st1 + " лучше чем " + st2);
        } else {
            System.out.println("Студент " + st2 + " лучше чем " + st1);
        }
        System.out.println(" ");
    }
    public static void topHufflepuff(Hufflepuff st1, Hufflepuff st2) {
        int student1 = st1.getHardworking() + st1.getLoyal() + st1.getHonest();
        int student2 = st2.getHardworking() + st2.getLoyal() + st2.getHonest();
        if (student1 > student2) {
            System.out.println("Студент " + st1 + " лучше чем " + st2);
        } else {
            System.out.println("Студент " + st2 + " лучше чем " + st1);
        }
        System.out.println(" ");
    }
    public static void topRavencraw(Ravencraw st1, Ravencraw st2) {
        int student1 = st1.getSmart() + st1.getWise() + st1.getWitty() + st1.getCreativity();
        int student2 = st2.getSmart() + st2.getWise() + st2.getWitty() + st2.getCreativity();
        if (student1 > student2) {
            System.out.println("Студент " + st1 + " лучше чем " + st2);
        } else {
            System.out.println("Студент " + st2 + " лучше чем " + st1);
        }
        System.out.println(" ");
    }

    public static void topStudent(Hogwarts student1, Hogwarts student2) {
        int st1 = student1.getStrong() + student1.getTransgress();
        int st2 = student2.getStrong() + student2.getTransgress();
        if (st1 > st2) {
            System.out.println("Студент " + student1 + " лучше чем " + student2);
        } else {
            System.out.println("Студент " + student2 + " лучше чем " + student2);
        }
    }
}