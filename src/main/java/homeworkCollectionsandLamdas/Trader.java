package homeworkCollectionsandLamdas;
//import lombok.ToString;

import lombok.ToString;

@ToString
public class Trader {
    private String name;
    private String city;

    public Trader(String name, String city){
        this.name=name;
        this.city=city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}