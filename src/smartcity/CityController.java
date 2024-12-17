package smartcity;

public class CityController {
    private static CityController instance;

    private CityController() {
    }

    public static CityController getInstance() {
        if (instance == null) {
            instance = new CityController();
        }
        return instance;
    }

    public void manageStreetLights() {
        System.out.println("Managing Street Lights...");
    }

    public void manageTrafficSignals() {
        System.out.println("Managing Traffic Signals...");
    }

    public void sendSecurityAlert(String message) {
        System.out.println("Sending Security Alert: " + message);
    }
}
