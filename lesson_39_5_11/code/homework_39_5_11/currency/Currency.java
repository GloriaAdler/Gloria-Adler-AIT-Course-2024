package homework_39_5_11.currency;

public enum Currency {

    USD ("USD", 0.9152),//1 доллар = 0.9152 Euro
    RUB ("RUB", 0.009356),//1 рубль = ---
    JPY ("USD", 0.006037),//1 йена = ---
    CNY ("CNY", 0.128825),//1 юань = ---
    PLN ("PLN", 0.229468),//1 злотый = ---
    CHF ("CHF", 1.06);//1 швейцарский франк = ---

    private final String code;
    private final double rateToEuro;//rate - ставка

    Currency(String code, double rateToEuro) {
        this.code = code;
        this.rateToEuro = rateToEuro;
    }

    public String getCode() {
        return code;
    }

    public double getRateToEuro() {
        return rateToEuro;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Currency{");
        sb.append("code='").append(code).append('\'');
        sb.append(", rateToEuro=").append(rateToEuro);
        sb.append('}');
        return sb.toString();
    }
}
