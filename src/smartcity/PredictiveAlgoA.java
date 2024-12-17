package smartcity;

public class PredictiveAlgoA implements Strategy {
    public void predict(String predictionCase, HybridCloud hybridCloud) {
        if (predictionCase.equals("Traffic")){
            System.out.println("Predicting Traffic Using Algorithm A: ");
        }
        else if (predictionCase.equals("Energy")){
            System.out.println("Predicting Energy Consumption Using Algorithm A: ");
        }
        callHybridCloud(predictionCase, hybridCloud);
    }

    public void callHybridCloud(String predictionCase, HybridCloud hybridCloud) {
        System.out.println(hybridCloud.distributedComputation(predictionCase));
    }
}
