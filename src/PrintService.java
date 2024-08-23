public class PrintService {
    public static void print(Gryffindor[] gryffindor) {
        System.out.println("Список студентов факультета Гриффиндор");
        for (int i = 0; i < gryffindor.length; i++) {
            Gryffindor gryffindor1 = gryffindor[i];
            System.out.println("Ученик - " +
                    "имя - " + gryffindor1.getName() +
                    ", фамилия - " + gryffindor1.getSurname() +
                    ", благородство: " + gryffindor1.getHonor() +
                    ", честь: " + gryffindor1.getNobility() +
                    ", храбрость: " + gryffindor1.getBravery());

        }
        System.out.println(" ");
    }

    public static void print(Slytherin[] slytherins) {
        System.out.println("Список студентов факультета Слизерин");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Ученик - " +
                    "имя: " + slytherin.getName() +
                    ", фамилия: " + slytherin.getSurname() +
                    ", хитрость: " + slytherin.getCunning() +
                    ", решительность: " + slytherin.getDetermination() +
                    ", амбициозность: " + slytherin.getAmbition() +
                    ", находчивость: " + slytherin.getResourcefulness() +
                    ", жажда власти: " + slytherin.getThirstPower());

        }
        System.out.println(" ");
    }

    public static void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Список студентов факультета Пуффендуй");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Ученик - " +
                    "имя: " + hufflepuff.getName() +
                    ", фамилия: " + hufflepuff.getSurname() +
                    ", трудолюбивость: " + hufflepuff.getHardworking() +
                    ", верность: " + hufflepuff.getLoyal() +
                    ", честность: " + hufflepuff.getHonest());

        }
        System.out.println(" ");
    }

    public static void print(Ravencraw[] ravencraws) {
        System.out.println("Список студентов факультета Когтевран");
        for (int i = 0; i < ravencraws.length; i++) {
            Ravencraw ravencraw = ravencraws[i];
            System.out.println("Ученик - " +
                    "имя: " + ravencraw.getName() +
                    ", фамилия: " + ravencraw.getSurname() +
                    ", интеллект: " + ravencraw.getSmart() +
                    ", мудрость: " + ravencraw.getWise() +
                    ", остроумие: " + ravencraw.getWitty() +
                    ", творчество: " + ravencraw.getCreativity());

        }
        System.out.println(" ");
    }
}
