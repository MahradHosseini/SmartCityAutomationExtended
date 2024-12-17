package smartcity;

public interface Strategy {
    public void predict(String predictionCase, HybridCloud hybridCloud);
    public void callHybridCloud(String predictionCase, HybridCloud hybridCloud);
}
