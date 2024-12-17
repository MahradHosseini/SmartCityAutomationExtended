import smartcity.*;

public class Main {
    public static void main(String[] args) {
        // Accessing the single instance of CityController
        CityController cityController = CityController.getInstance();

        // Observer: Setting up notification service and observers
        NotificationService notificationService = new NotificationService();
        Resident resident1 = new Resident("John Doe");
        Resident resident2 = new Resident("Jane Smith");
        PublicSafetyAuthority safetyAuthority = new PublicSafetyAuthority();

        // Adding observers
        notificationService.addObserver(resident1);
        notificationService.addObserver(resident2);
        notificationService.addObserver(safetyAuthority);

        // Triggering notifications
        notificationService.notifyObservers("Security breach detected in downtown area");

        // Command: Using command pattern to manage the city
        Command turnOnLights = new TurnOnLightsCommand(cityController);

        // Execute commands
        turnOnLights.execute();

        // Adapter: Using the adapter for DigitalBank payments
        // Making a payment using cryptocurrency
        CryptocurrencyPayment cryptoPayment = new CryptocurrencyPayment();
        DigitalBanking cryptoProcessor = new CryptoPaymentAdapter(cryptoPayment);
        cryptoProcessor.processPayment(100);

        // Making a payment using fiat
        FiatPayment fiatPayment = new FiatPayment();
        DigitalBanking fiatProcessor = new FiatPaymentAdapter(fiatPayment);
        fiatProcessor.processPayment(100);

        // Template Method: Performing daily routines
        DailyRoutine lightingRoutine = new LightingRoutine();
        DailyRoutine securityCheckRoutine = new SecurityCheckRoutine();

        // Performing routines
        lightingRoutine.performRoutine();
        securityCheckRoutine.performRoutine();

        // Additional CityController functionalities
        cityController.manageStreetLights();
        cityController.manageTrafficSignals();
        cityController.sendSecurityAlert("Unauthorized drone detected");

        // Initializing Hybrid Cloud Proxy
        HybridCloud hybridCloud = new ProxyHybridCloud();
        hybridCloud.storeData("CNG353");
        hybridCloud.loadData("CNG353");

        // Strategy Pattern for Traffic/Energy Consumption Predictions
        // Starting with Algorithm A
        StrategyContext context = new StrategyContext(new PredictiveAlgoA());
        context.executeStrategy("Traffic", hybridCloud);
        context.executeStrategy("Energy", hybridCloud);

        // Switching to Algorithm B
        context.setStrategy(new PredictiveAlgoB());
        context.executeStrategy("Traffic", hybridCloud);
        context.executeStrategy("Energy", hybridCloud);

    }
}
