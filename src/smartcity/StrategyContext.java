package smartcity;

public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(String predictionCase, HybridCloud hybridCloud) {
        strategy.predict(predictionCase, hybridCloud);
    }
}
