public class Event {
    public int type; // 1 is play 2 is concert 3 is movie
    public String title;
    public String location;
    public String description;
    public String comments;
    public int ageRestrict;
    public int rating;

    public Event(int type, String title, String location, String description, String comments, int ageRestrict, int rating) {
        this.type = type;
        this.title = title;
        this.location = location;
        this.description = description;
        this.comments = comments;
        this.ageRestrict = ageRestrict;
        this.rating = rating;
    }

    public int getAgeRestrict() {
        return ageRestrict;
    }

    public void setAgeRestrict(int ageRestrict) {
        this.ageRestrict = ageRestrict;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
