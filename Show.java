public class Show {
    private String location;
    private String identification;
    private String title;
    private int rating;
    private String description;

    public Show(String location, String identification, String title,
                int rating, String description) {
        this.location = location;
        this.identification = identification;
        this.title = title;
        this.rating = rating;
        this.description = description;
    }

    public String toString() {
        return "________________________\nLocation: " + location + "\nType: " + identification + "\nTitle " + title + "\nRating " + rating
                + "\nDescription " + description + "\n________________________";
    }
}
