package smartcity;

public class FiatPaymentAdapter implements DigitalBanking{
    private FiatPayment fiatPayment;

    public FiatPaymentAdapter(FiatPayment fiatPayment) {
        this.fiatPayment = fiatPayment;
    }

    public void processPayment(double amount){
        fiatPayment.processFiat(amount);
    }
}
