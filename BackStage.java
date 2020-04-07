/**
 * This class holds all methods that are used in the main method.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BackStage {

    public static Scanner keyboard = new Scanner(System.in);
    static private int type;
    static private String title;
    static private String location;
    static private String description;
    static private String comment;
    static private int ageRestrict;
    static private int rating;
    static private Event best;

    /**
     * This method adds an event to the event array in the main method
     * @return Event
     */
    public static Event employeeAdd() {
        System.out.println("please add a movie");
        System.out.println("Please enter the event type");
        type = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Please enter the title of the event");
        title = keyboard.nextLine();
        System.out.println("Please enter the location");
        location = keyboard.nextLine();
        System.out.println("Please enter the description");
        description = keyboard.nextLine();
        System.out.println("Please enter comments");
        comment = keyboard.nextLine();
        System.out.println("Please enter the age restriction");
        ageRestrict = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Please enter the show rating");
        rating = keyboard.nextInt();
        keyboard.nextLine();

        best = new Event(type,title,location,description,comment,ageRestrict,rating);
        return best;
    }


    /**
     * This method takes in four parameters from the main then adds the users rating and comment.
     * @param rating
     * @param comment
     * @param eventTitle
     * @param events
     */
    public static void leaveFeedbac(int rating, String comment, String eventTitle, Event[] events) {
        for(int i = 0;i < events.length; i++) {
            if(events[i].title.equals(eventTitle)) {
                events[i].rating = rating;
                events[i].comments = comment;
            }
        }
    }

    /**
     * This method takes in two parameters from the main method, then prints the seating chart.
     * @param seatChar
     * @param SEATNUM
     */
    public static void printSeats(String[][] seatChar , int SEATNUM) {
        int rowNum = 1;
        System.out.println("     SCREEN/STAGE");
        System.out.println("   1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < SEATNUM; i++) {
            System.out.print(rowNum + ": ");
            for (int j = 0; j < SEATNUM; j++) {
                System.out.print(seatChar[i][j] + " ");
            }
            System.out.println();
            rowNum++;
        }
    }

    /**
     * This method prints the plays from the event list.
     * @param events
     */
    public static void printPlay(Event[] events) {
        for (int i = 0; i < events.length; i++) {
            if (events[i].type == 1)
                System.out.println(events[i].title + "\nDescription: " + events[i].description  +
                        "\nRating: " + events[i].rating + "\n");
        }
    }

    /**
     * This method prints concerts from the event list.
     * @param events
     */
    public static void printConcert(Event[] events) {
        for (int i = 0; i < events.length; i++)
            if (events[i].type == 2)
                System.out.println(events[i].title + "\nDescription: " + events[i].description +
                        "\nRating: " + events[i].rating + "\n");
    }

    /**
     * This method prints the movies from the event list.
     * @param events
     */
    public static void printMovie(Event[] events) {
        for (int i = 0; i < events.length; i++)
            if (events[i].type == 3)
                System.out.println(events[i].title + "\nDescription: " + events[i].description +
                        "\nRating: " + events[i].rating + "\n");
    }

    /**
     * This method prints the tickets to a .txt file. Path is set up for a file
     * that is named "tickets.txt" located in the src folder of the project.
     * @param events
     * @param eventTitle
     * @param numTickets
     * @param seats
     * @throws IOException
     */
    public static void printTickets(Event[] events, String eventTitle, int numTickets, int[] seats) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/bricen/Desktop/java_YEAH/Event/src/tickets.txt"));
        System.out.println("Printing your tikcets now");

        int num = 0;
        int ticket = 1;
        while (num < numTickets) {
            writer.write("               MOVIE TICKET " + ticket++);
            writer.newLine();
            writer.write("****************************************");
            writer.newLine();
            writer.write("               ONE ENTRY ONLY           \n");
            writer.newLine();
            for (int i = 0; i < events.length; i++) {
                if (events[i].title.equals(eventTitle)) {
                    writer.write("TITLE: " + events[i].title + "\nLocation: " + events[i].location);
                }
            }
            writer.newLine();
            writer.write("Seat Number in Row:Col " + seats[num]);
            writer.newLine();
            writer.write("*****************************************");
            writer.newLine();
            num++;
        }
        writer.close();
        System.out.println("Done printing tickets");
    }
}
