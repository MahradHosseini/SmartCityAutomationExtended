package smartcity;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RealHybridCloud implements HybridCloud {
    public RealHybridCloud(){}

    public void storeData(String data){
        System.out.println("Hybrid Cloud stored in DB: " + data);
    }

    public void loadData(String data){
        System.out.println("Hybrid Cloud loaded from DB: " + data);
    }

    public String distributedComputation(String predictionCase){
        System.out.println("Hybrid Cloud computed: " + predictionCase);
        List<String> Vals;
        if (predictionCase.equals("Traffic")){
            Vals = Arrays.asList("Heavy", "Moderate", "Low", "No");
        }
        else if (predictionCase.equals("Energy")){
            Vals = Arrays.asList("High", "Medium", "Low");
        }
        else {
            return null;
        }

        Random rand = new Random();
        int randomIndex = rand.nextInt(Vals.size());

        return Vals.get(randomIndex) + " " + predictionCase;
    }
}
