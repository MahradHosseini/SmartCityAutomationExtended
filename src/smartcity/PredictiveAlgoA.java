package smartcity;

public class PredictiveAlgoA implements Strategy {
    public void predict(String PredictionCase){
        if (PredictionCase.equals("Traffic")){
            System.out.println("Predicting Traffic Using Algorithm A");
        }
        else if (PredictionCase.equals("Energy")){
            System.out.println("Predicting Energy Consumption Using Algorithm A");
        }
        else{
            System.out.println("Requested Prediction Case Not Found");
        }
    }
}
