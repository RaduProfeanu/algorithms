package homework9;

public class Video {

    private String title;
    private int averageRating;
    private int stock;
    private int ratingNo;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public  boolean isAvailable(){
            return stock>0;
    }

    public void rented(){
        if(isAvailable()){
            stock--;
        }else{
            System.out.println("Video out of stock");
        }
    }

    public void returnVideo(){
            stock++;
    }

    public void rate(int rate){
       averageRating=(averageRating*ratingNo+rate)/(ratingNo+1);
        ratingNo++;
    }

    public int getRating() {
        return averageRating;
    }

    public void setRating(int rating) {
        this.averageRating = averageRating;
    }

    public Video(String title) {
        this.title = title;
        this.averageRating=0;
        this.stock=1;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", averageRating=" + averageRating +
                ", stock=" + stock +
                ", ratingNo=" + ratingNo +
                '}';
    }
}
