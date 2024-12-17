package smartcity;

public class PredictiveAlgoB implements Strategy{
    public void predict(String PredictionCase){
        if (PredictionCase.equals("Traffic")){
            System.out.println("Predicting Traffic Using Algorithm B");
        }
        else if (PredictionCase.equals("Energy")){
            System.out.println("Predicting Energy Consumption Using Algorithm B");
        }
        else{
            System.out.println("Requested Prediction Case Not Found");
        }
    }
}
