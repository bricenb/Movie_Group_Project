/**
** Team Name: Bricen Bennett,John Saidi, Jackson G.,Thomas Jervey.
**/
import java.io.IOException;
import java.util.Scanner;

public class EventTester {
    public static final int SEATNUM = 9;
    public static Scanner keyboard = new Scanner(System.in);
    public static final int EVENTNUMBER = 20;
    public static final int USERNUMBER = 4;

    public static void main(String[] args) {
        User[] users = new User[USERNUMBER];
        Event[] events = new Event[EVENTNUMBER];
        int signin;
        String[] signupArr = new String[5];
        String[][] seatChar = new String[SEATNUM][SEATNUM];
        int rating;
        String comment;
        boolean titleScreen = true;

        for (int i = 0; i < seatChar.length; i++) {
            for (int j = 0; j < seatChar.length; j++) {
                seatChar[i][j] = "O";
            }
        }

        users[0] = new Employee("bricen", "best", 18, 123);
        users[1] = new AccountHolder("jackson", "rad", 21, 0, 123456);
        users[2] = new AccountHolder("brad", "radbrad", 11, 0, 56789);
        users[3] = new Employee("emily", "radem", 39, 45667);

        events[0] = new Event(2, "Guns and Roses", "Columbia Center", "Classic Rock",
                "great show", 5, 5);
        events[1] = new Event(2, "Taylor Swift", "Columbia theater", "Country singer turned pop star/break up singer",
                "good acting", 4, 4);
        events[2] = new Event(2, "pink floyd", "Richland Events", "Classic Rock",
                "great music", 18, 3);
        events[3] = new Event(2, "Jimmy Buffet", "Colonial Life", "Old Beach Bum singing",
                "great story line", 18, 5);
        events[4] = new Event(2, "Eric Church", "USC colissium", "Country singer",
                "crazyyyyy!!!!", 16, 5);
        events[5] = new Event(1, "Hamlet", "Columbia movies", "Old English play",
                "great show", 5, 5);
        events[6] = new Event(1, "Long Day's Journey", "Columbia theater", "Drama set in the 50's",
                "good acting", 4, 4);
        events[7] = new Event(1, "Death of a sales man", "Richland Events Center", "Thriller",
                "great music", 18, 3);
        events[8] = new Event(1, "Hamloit", "Columbia movies", "musicla about the history of America",
                "great story line", 18, 5);
        events[9] = new Event(1, "Lion King", "Columbia theater", "Classic kids movie about the circle of life",
                "crazyyyyy!!!!", 16, 5);
        events[10] = new Event(3, "Great Gaspy", "Columbia movies", "Drama set in the late American 20's",
                "great show", 5, 5);
        events[11] = new Event(3, "Toy Story", "Columbia theater", "kids movie with talking toys",
                "good acting", 4, 4);
        events[12] = new Event(3, "Super Size Me", "Richland movies", "Documentary about McDonalds",
                "great music", 18, 3);
        events[13] = new Event(3, "Hunters", "Columbia movies", "people hunting people",
                "great story line", 18, 5);
        events[14] = new Event(3, "Tiger King", "Columbia theater", "A guy who owns tigers",
                "crazyyyyy!!!!", 16, 5);
        events[15] = new Event(3, "Frozen 2", "Columbia movies", "Ice Queen who discovers her inner power",
                "great show", 5, 5);
        events[16] = new Event(3, "Avengers", "Columbia theater", "Super Heros saving New York",
                "good acting", 4, 4);
        events[17] = new Event(3, "Avneger End Game", "Richland movies", "The best movie ever",
                "great music", 18, 3);
        events[18] = new Event(3, "Star Wars", "Columbia movies", "People move things with their minds",
                "great story line", 18, 5);
        events[19] = new Event(3, "Wolf of Wall Street", "Columbia theater", "An actual wolf that lives on Wall Street",
                "crazyyyyy!!!!", 16, 5);



            System.out.println("****************************");
            System.out.println("WELCOME TO TICKET FINDER");
            System.out.println("If you already have an account Please sign in\nIf not sign up TODAY");
            System.out.println("press '1' to sign into your account\npress '2' to create a new one" +
                    "\npress '3' if you would like to continue as a guest" +
                    "\nEmployees, Please enter 4 to enter the system");
            signin = keyboard.nextInt();
            keyboard.nextLine();

            if (signin == 2) {
                System.out.println("Please enter your name");
                signupArr[0] = keyboard.nextLine();
                System.out.println("please enter a password");
                signupArr[1] = keyboard.nextLine();
                System.out.println("Please enter your age");
                signupArr[2] = keyboard.nextLine();
                System.out.println("enter your reward points");
                signupArr[3] = keyboard.nextLine();
                System.out.println("Please enter your card number");
                signupArr[4] = keyboard.nextLine();
                users[3] = new AccountHolder(signupArr[0], signupArr[1], Integer.parseInt(signupArr[2]),
                        Integer.parseInt(signupArr[3]), Integer.parseInt(signupArr[4]));
                System.out.println("\nWelcome " + users[3].name);

            } else if (signin == 1) {
                System.out.println("please enter your first Name");
                signupArr[0] = keyboard.nextLine();
                System.out.println("please enter your password");
                signupArr[1] = keyboard.nextLine();
                for (int i = 0; i < users.length; i++) {
                    if (signupArr[0].equals(users[i].name) && signupArr[1].equals(users[i].password))
                        System.out.println("Welcome " + users[i].name);
                }
            } else if (signin == 3) {
                System.out.println("guest today");
            } else if (signin == 4) {
                System.out.println("welcome employee");
                events[4] = BackStage.employeeAdd();
            }


        if(signin > 0 && signin < 4 ) {
            boolean keepGoing = true;
            while (keepGoing) {
                System.out.println("If you would like to see a Play press 1" +
                        "\nIf you would like to see a Concert press 2" +
                        "\nIf you would like to see a Movie press 3" +
                        "\nIf you would like to quit press 0");
                int type = keyboard.nextInt();

                if (type == 1)
                    BackStage.printPlay(events);
                else if (type == 2)
                    BackStage.printConcert(events);
                else if (type == 3)
                    BackStage.printMovie(events);
                else if (type == 0)
                    keepGoing = false;
                keyboard.nextLine();

                if (type == 1 || type == 2 || type == 3) {
                    System.out.print("Which one would you like to see?\n");
                    String eventTitle = keyboard.nextLine();
                    System.out.println("How many tickets would you like?");
                    int numTickets = keyboard.nextInt();
                    int[] seats = new int[numTickets];
                    BackStage.printSeats(seatChar,SEATNUM);
                    for (int i = 0; i < numTickets; i++) {
                        System.out.println("please enter a seat number row then colum (ex:12)");
                        seats[i] = keyboard.nextInt();
                    }
                    System.out.println();
                    try {
                        BackStage.printTickets(events, eventTitle, numTickets, seats);
                    } catch (IOException excpt) {
                        excpt.printStackTrace();
                    }

                    System.out.println("please leave a rating for the show out of 5 Stars");
                    rating = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("please leave a comment about the show");
                    comment = keyboard.nextLine();

                    BackStage.leaveFeedbac(rating, comment, eventTitle, events);
                }
            }
        }
    }
}
