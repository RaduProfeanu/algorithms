package homework9;

public class Video {

    private String title;
    private boolean availability;
    private int rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Video(String title, boolean availability, int rating) {
        this.title = title;
        this.availability = availability;
        this.rating = rating;
    }

    public void checkout(boolean availability){
        if(availability){
            System.out.println("The item is on inventory");
        }else{
            System.out.println("The item is checked out");
        }
    }
}
