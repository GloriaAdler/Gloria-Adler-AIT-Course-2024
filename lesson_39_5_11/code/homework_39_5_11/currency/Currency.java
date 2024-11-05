package homework_39_5_11.currency;

public enum Currency {

    USD (0.9152),//1 доллар = 0.9152 Euro
    RUB (0.009356),//1 рубль = ---
    JPY (0.006037),//1 йена = ---
    CNY (0.128825),//1 юань = ---
    PLN (0.229468),//1 злотый = ---
    CHF (1.06);//1 швейцарский франк = ---

    private final double rateToEuro;//rate - ставка

    Currency(double rateToEuro) {
        this.rateToEuro = rateToEuro;
    }

    public double getRateToEuro() {
        return rateToEuro;
    }
}
