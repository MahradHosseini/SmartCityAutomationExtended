package smartcity;

// Concrete command to turn on street lights
public class TurnOnLightsCommand implements Command{
    private CityController cityController;

    public TurnOnLightsCommand(CityController cityController){
        this.cityController = cityController;
    }

    public void execute(){
        cityController.manageStreetLights();
    }
}
