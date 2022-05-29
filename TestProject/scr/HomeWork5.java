package Home;

public class HomeWork5 {

    public static void main(String[] args) {

        Human Human1 = new Human("Robert", "Eng", "nnnn@nnn.com", "79995243555", 30000, 25);
        Human Human2 = new Human("Shon", "Teacher", "WWW@nnn.com", "79989299292", 20000, 30);
        Human Human3 = new Human("Kolya", "Professor", "WWW@nnn.com", "79989299292", 20000, 41);
        Human Human4 = new Human("Kris", "Team Lead", "WWW@nnn.com", "79989299292", 20000, 40);
        Human Human5 = new Human("Aron", "Tester", "WWW@nnn.com", "79989299292", 20000, 39);
        System.out.println("==========================================");


        Human[] work = {
                new Human("Robert", "Eng", "nnnn@nnn.com", "79995243555", 30000, 25),
                new Human("Shon", "Teacher", "WWW@nnn.com", "79989299292", 20000, 30),
                new Human("Kolya", "Professor", "WWW@nnn.com", "79989299292", 20000, 41),
                new Human("Kris", "Team Lead", "WWW@nnn.com", "79989299292", 20000, 40),
                new Human("Aron", "Tester", "WWW@nnn.com", "79989299292", 20000, 39),
        };
        System.out.println("**************************");
        AllHuman(work);
        System.out.println("**************************");
        oldhuman(work, 40);
    }


    public static void AllHuman(Human[] work){
        for (int i = 0; i < work.length; i++)
        System.out.println((i+1) + " " + work[i].Info());
    }

    public static void oldhuman(Human[] work, int year){
        for (int i = 0; i < work.length; i++){
            if (work[i].Age > year){
                System.out.println(work[i].Info());
            }
        }
    }
}

