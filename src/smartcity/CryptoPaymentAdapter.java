package smartcity;

public class CryptoPaymentAdapter implements DigitalBanking{
    private CryptocurrencyPayment cryptoPayment;

    public CryptoPaymentAdapter(CryptocurrencyPayment cryptoPayment) {
        this.cryptoPayment = cryptoPayment;
    }

    public void processPayment(double amount) {
        cryptoPayment.processCrypto(amount);
    }
}
