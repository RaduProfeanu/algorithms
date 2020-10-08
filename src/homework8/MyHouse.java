package homework8;

public class MyHouse {

    private gamesRoom aGamesRoom;
    private gamingDesktop GamingDesktop;
    private gamingChair GamingChair;

    public MyHouse(gamesRoom aGamesRoom, gamingDesktop gamingDesktop, gamingChair gamingChair) {
        this.aGamesRoom = aGamesRoom;
        GamingDesktop = gamingDesktop;
        GamingChair = gamingChair;
    }

    public void welcome(){
        aGamesRoom.havingFun();
        GamingDesktop.starGamingDesktop();
        GamingChair.retractChair();
    }

    public gamesRoom getaGamesRoom() {
        return aGamesRoom;
    }

    public void setaGamesRoom(gamesRoom aGamesRoom) {
        this.aGamesRoom = aGamesRoom;
    }

    public gamingDesktop getGamingDesktop() {
        return GamingDesktop;
    }

    public void setGamingDesktop(gamingDesktop gamingDesktop) {
        GamingDesktop = gamingDesktop;
    }

    public gamingChair getGamingChair() {
        return GamingChair;
    }

    public void setGamingChair(gamingChair gamingChair) {
        GamingChair = gamingChair;
    }
}
