package homework9;

public class VideoStoreLauncher {
    public static void main(String[] args) {
        VideoStore store=new VideoStore();
        store.addVideo("Matrix");
        store.addVideo("Matrix");
        store.addVideo("Matrix");
        store.addVideo("Star Wars");
        store.addVideo("Jaws");
        store.addVideo("Jaws");

        store.listInventory();

        store.checkout("Star Wars");
        store.checkout("Matrix");

        store.listInventory();

        store.returnVideo("Star Wars");
        store.returnVideo("Matrix");

        store.listInventory();


    }
}
