package oop.lab;

public class CreditCard extends Card {
    public CreditCard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }

    @Override
    public double getInterestRate() {
        double rate = 10.0;
        System.out.println("The interest rate is " + rate + "%");
        return rate;
    }
}

