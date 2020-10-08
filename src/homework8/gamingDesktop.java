package homework8;

public class gamingDesktop {
    public String manufacturer;
    public String model;
    public boolean hasGraphicboard;
    public int ram;

    public gamingDesktop(String manufacturer, String model, boolean hasGraphicboard, int ram) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.hasGraphicboard = hasGraphicboard;
        this.ram = ram;
    }

    public void starGamingDesktop(){
        System.out.println("Starting my computer...");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isHasGraphicboard() {
        return hasGraphicboard;
    }

    public void setHasGraphicboard(boolean hasGraphicboard) {
        this.hasGraphicboard = hasGraphicboard;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
