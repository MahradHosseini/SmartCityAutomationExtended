package smartcity;

// Concrete Observer for Residents
public class Resident implements Observer{
    private String name;

    public Resident(String name){
        this.name = name;
    }

    public void update(String message){
        System.out.println("Resident " + name + " received notification: " + message);
    }
}
