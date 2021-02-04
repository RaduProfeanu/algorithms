package homework8;

public class gamesRoom {

    public String wallsColor;
    public int noOfBoardgames;
    public boolean hasMiniBar;

    public gamesRoom(String wallsColor, int noOfBoardgames, boolean hasMiniBar) {
        this.wallsColor = wallsColor;
        this.noOfBoardgames = noOfBoardgames;
        this.hasMiniBar = hasMiniBar;
    }

    public void havingFun(){
        System.out.println("Having fun in games room...");
    }

    public String getWallsColor() {
        return wallsColor;
    }

    public void setWallsColor(String wallsColor) {
        this.wallsColor = wallsColor;
    }

    public int getNoOfBoardgames() {
        return noOfBoardgames;
    }

    public void setNoOfBoardgames(int noOfBoardgames) {
        this.noOfBoardgames = noOfBoardgames;
    }

    public boolean isHasMiniBar() {
        return hasMiniBar;
    }

    public void setHasMiniBar(boolean hasMiniBar) {
        this.hasMiniBar = hasMiniBar;
    }
}
