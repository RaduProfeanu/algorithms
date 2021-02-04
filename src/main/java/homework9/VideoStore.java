package homework9;

import java.util.ArrayList;
import java.util.List;

public class VideoStore{

    private final List<Video> inventory; // video instances

    public VideoStore() {
        this.inventory = new ArrayList<>();
    }

    public void addVideo(String title){
        Video video=new Video(title);
        boolean videoIsAvailable =false;
        for ( Video tempVideo:inventory){
            if (tempVideo.getTitle().equals(title)){
                int stock=tempVideo.getStock();
                tempVideo.setStock(stock+1);
                videoIsAvailable=true;
            }
        }
        if(videoIsAvailable==false){
            inventory.add(video);
        }
    }


    public void checkout(String title){
        boolean videoIsAvailable =false;
       for (Video video: inventory){
           if (video.getTitle().equals(title)){
               video.rented();
               videoIsAvailable=true;
               break;
           }
       }

       if(videoIsAvailable){
           System.out.println("Video"+title+"rented succesfully");
       }else{
           System.out.println("We don't have this video");
       }
    }

    public void returnVideo(String title){
        for ( Video video:inventory){
            if (video.getTitle().equals(title)){
                video.returnVideo();
            }
        }
    }

    public void receiveRating(String title,int rating){
        for ( Video video:inventory) {
            if (video.getTitle().equals(title)) {
                video.rate(rating);
                break;
            }
        }
    }

    public void listInventory(){
        for (Video video : inventory) {
            System.out.println(video);
        }
    }
}
