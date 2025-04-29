package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {
    public SavingsAccount (String num, String holder, double balance){
        super(num,holder,balance);
    }

    @Override
    public void transferFunds(double amount, String nama) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferfunds'");
    }

    @Override
    public void payBills(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'payBills'");
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 100.0;
    }
}
