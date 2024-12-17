package smartcity;

public class ProxyHybridCloud implements HybridCloud {
    private RealHybridCloud realHybridCloud;

    public void storeData(String data){
        System.out.println("Proxy was called to store: " + data);
        realHybridCloud.storeData(data);
    }

    public void loadData(String data){
        System.out.println("Proxy was called to load: " + data);
        realHybridCloud.loadData(data);
    }

    public String distributedComputation(String predictionCase){
        System.out.println("Proxy was called to compute: " + predictionCase);
        return realHybridCloud.distributedComputation(predictionCase);
    }

}
