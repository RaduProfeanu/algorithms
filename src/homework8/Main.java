package homework8;

public class Main {
    public static void main(String[] args) {

        gamesRoom camera= new gamesRoom("white",30,true);
        gamingChair scaun= new gamingChair("red",100,true);
        gamingDesktop PC = new gamingDesktop("Dell","ABC",true,2048);
        MyHouse house= new MyHouse(camera,PC,scaun);

        house.welcome();


    }
}
