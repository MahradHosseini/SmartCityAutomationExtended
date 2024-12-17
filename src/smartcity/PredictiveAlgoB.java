package smartcity;

public class PredictiveAlgoB implements Strategy{
    public void predict(String predictionCase, HybridCloud hybridCloud){
        if (predictionCase.equals("Traffic")){
            System.out.println("Predicting Traffic Using Algorithm B: ");
        }
        else if (predictionCase.equals("Energy")){
            System.out.println("Predicting Energy Consumption Using Algorithm B: ");
        }
        callHybridCloud(predictionCase, hybridCloud);
    }

    public void callHybridCloud(String predictionCase, HybridCloud hybridCloud){
        System.out.println(hybridCloud.distributedComputation(predictionCase));
    }
}
