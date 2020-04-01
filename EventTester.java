import java.util.Scanner;

public class EventTester {
    public static void main(String[] args) {
        String arr[];
        arr = new String[5];
        Scanner in = new Scanner(System.in);
        Event test = new Event("Events list");
        for(int i = 0; i < 10; i++) {
            test.addShow("charleston place", "Movie", "Hunters", 5, "" +
                    "this is the best movie ever, got the best effects, good acting");
        }
        boolean quit = false;
        int arr_index = 0;
        while(!quit) {
            System.out.println("Add: Press a" + "\n" + "Done Adding: Press d");
            if(in.nextLine().equals("d")) {
                quit = true;
            } else {
                System.out.println("Enter Location");
                arr[0] = in.nextLine();
                System.out.println("Enter Identification");
                arr[1] = in.nextLine();
                System.out.println("Enter Title");
                arr[2] = in.nextLine();
                System.out.println("Enter rating");
                arr[3] = in.nextLine();
                System.out.println("Enter Description");
                arr[4] = in.nextLine();
                test.addShow(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]), arr[4]);

            }
        }
        EventIterator showIterator = test.createIterator();

        System.out.println("______________________________");
        System.out.println("             LIST                ");
        int count = 1;
        while(showIterator.hasNext()) {
            Show show = showIterator.next();
            System.out.println("\n" + count);
            System.out.println(show);
            count++;
        }
    }
}
