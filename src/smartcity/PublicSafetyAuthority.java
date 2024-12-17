package smartcity;

// Concrete Observer for Public Safety Authorities
public class PublicSafetyAuthority implements Observer{
    public void update(String message){
        System.out.println("Public Safety Authority received notification: " + message);
    }
}
