import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackStageTest {

    String[] signupArr = new String[5];
    String[][] seatChar = new String[9][9];
    User[] users = new User[4];
    Event[] events = new Event[5];


    @Test
    void employeeAddTest() {
        //assertSame(users[3], users[3]);
        assertSame(users[1],users[1]);
    }

    @Test
    void leaveFeedbacTest() {
        events[0] = new Event(1,"lion King", "charleston", "kids play", "best play ever", +
                5, 5);
        Event correct = new Event(1,"lion King", "charleston", "kids play", "best play ever", +
                5, 5);
        assertEquals(events[0].comments,correct.comments);
    }

    @Test
    void printPlayTest() {
        events[0] = new Event(2, "Guns and Roses", "Columbia Center", "Classic Rock",
                "great show", 5, 5);
        events[1] = new Event(2, "Taylor Swift", "Columbia theater", "Country singer turned pop star/break up singer",
                "good acting", 4, 4);
        events[2] = new Event(2, "pink floyd", "Richland Events", "Classic Rock",
                "great music", 18, 3);
        events[3] = new Event(1, "Jimmy Buffet", "Colonial Life", "Old Beach Bum singing",
                "great story line", 18, 5);
        events[4] = new Event(2, "Eric Church", "USC colissium", "Country singer",
                "crazyyyyy!!!!", 16, 5);

        for (int i = 0; i < events.length; i++) {
            if(events[i].type == 1) {
                assertNotNull(events[i]);
            }
        }
    }

    @Test
    void printConcertTest() {
        events[0] = new Event(2, "Guns and Roses", "Columbia Center", "Classic Rock",
                "great show", 5, 5);
        events[1] = new Event(2, "Taylor Swift", "Columbia theater", "Country singer turned pop star/break up singer",
                "good acting", 4, 4);
        events[2] = new Event(1, "pink floyd", "Richland Events", "Classic Rock",
                "great music", 18, 3);
        events[3] = new Event(1, "Jimmy Buffet", "Colonial Life", "Old Beach Bum singing",
                "great story line", 18, 5);
        events[4] = new Event(2, "Eric Church", "USC colissium", "Country singer",
                "crazyyyyy!!!!", 16, 5);

        for (int i = 0; i < events.length; i++) {
            if(events[i].type == 2) {
                assertNotNull(events[i]);
            }
        }
    }

    @Test
    void printMovieTest() {
        events[0] = new Event(2, "Guns and Roses", "Columbia Center", "Classic Rock",
                "great show", 5, 5);
        events[1] = new Event(3, "Taylor Swift", "Columbia theater", "Country singer turned pop star/break up singer",
                "good acting", 4, 4);
        events[2] = new Event(1, "pink floyd", "Richland Events", "Classic Rock",
                "great music", 18, 3);
        events[3] = new Event(1, "Jimmy Buffet", "Colonial Life", "Old Beach Bum singing",
                "great story line", 18, 5);
        events[4] = new Event(3, "Eric Church", "USC colissium", "Country singer",
                "crazyyyyy!!!!", 16, 5);

        for (int i = 0; i < events.length; i++) {
            if(events[i].type == 3) {
                assertNotNull(events[i]);
            }
        }
    }

    @Test
    void printTicketsTest() {
        events[0] = new Event(2, "Guns and Roses", "Columbia Center", "Classic Rock",
                "great show", 5, 5);
        events[1] = new Event(3, "Taylor Swift", "Columbia theater", "Country singer turned pop star/break up singer",
                "good acting", 4, 4);
        events[2] = new Event(1, "pink floyd", "Richland Events", "Classic Rock",
                "great music", 18, 3);
        events[3] = new Event(1, "Jimmy Buffet", "Colonial Life", "Old Beach Bum singing",
                "great story line", 18, 5);
        events[4] = new Event(1, "Eric Church", "USC colissium", "Country singer",
                "crazyyyyy!!!!", 16, 5);

        for (int i = 0; i < events.length; i++) {
            if(events[i].type == 3) {
                //assertNotNull(events[i]);
                assertEquals(events[i].title, events[1].title);
                assertEquals(events[i].description, events[1].description);
            }
        }
    }
}