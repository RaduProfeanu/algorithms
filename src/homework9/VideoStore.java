package homework9;

public class VideoStore {
    private static String[] Video = {"Frozen", "Avengers:End Game", "Game of Thrones", "Star Wars"};

    public String[] addVideo(int n, String[] Video, String element) {

        String newVideo[]= new String[][n + 1];

        for (int i=0;i<n;i++){
            newVideo[i]=Video[i];
            newVideo[n]=element;
            return newVideo;
        }

    }

    public void receiveRating(String Video,int n){

    }

}

// --------------- Work in progress
