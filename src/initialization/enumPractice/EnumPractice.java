package initialization.enumPractice;

class EnumPractice {

    Currency currency;

    EnumPractice(Currency currency) {
        this.currency = currency;
    }

    public static void main(String[] args) {

        for (Currency c : Currency.values()) {
            System.out.print(c + " ");
            System.out.println(c.ordinal());
        }

        EnumPractice RMB = new EnumPractice(Currency.RMB),
                AUD = new EnumPractice(Currency.AUSDOLLAR),
                USD = new EnumPractice(Currency.USDOLLAR);

        RMB.describe();
        AUD.describe();
        USD.describe();
    }

    void describe() {
        switch (currency) {
            case RMB:
                System.out.println("used in china");
                break;
            case USDOLLAR:
                System.out.println("used in US");
                break;
            case AUSDOLLAR:
                System.out.println("used in AU");
        }
    }

}
