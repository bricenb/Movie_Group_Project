import java.util.Iterator;

public class EventIterator implements Iterator {
    private Show[] shows;
    private int position = 0;

    public EventIterator(Show[] shows) {
        this.shows = shows;
    }

    public boolean hasNext() {
        if(position >= shows.length || shows[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public Show next() {
        if(hasNext()) {
            Show show = shows[position];
            position = position +1;
            return show;
        } else if (hasNext() == false) {
            return null;
        } else {
            return null;
        }
    }
}
