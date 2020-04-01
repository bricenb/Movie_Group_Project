/**
 *
 */
public class Event {
    public int size = 10;
    private int count = 0;
    private String list = "";
    private Show[] shows;

    public Event(String name) {
        shows = new Show[size];
        this.list = list;
    }

    public void addShow(String location, String identification, String title,
                        int rating, String description) {
        Show show = new Show(location, identification, title, rating, description);
        if (count >= size) {
            growArray(shows);
            shows[count] = show;
            count = count +1;
        } else {
            shows[count] = show;
            count = count +1;
        }
    }

    public EventIterator createIterator() {
        return new EventIterator(shows);
    }

    private Show[] growArray(Show[] first) {
        shows = new Show[size*2];
        for(int i = 0; i < first.length; i++) {
            shows[i] = first[i];
        }
        size = size * 2;
        return shows;
    }

}
