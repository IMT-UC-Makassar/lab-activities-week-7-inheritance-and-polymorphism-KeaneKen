package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService {
    public BusinessAccount(String num, String holder, double balance) {
        super(num, holder, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 10.0;
    }

    @Override
    public void transferFunds(double amount, String nama) {
        if (getBalance() >= amount) {
            withdraw(amount);
            System.out.println("Withdrew $" + amount + " to " + nama);
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
    }

    @Override
    public void payBills(double amount){
        if (getBalance() >= amount) {
            withdraw(amount);
            System.out.println("Bills paid. Stay sigma");
        } else {
            System.out.println("Insufficient funds for bill payment.");
        }
    }

    @Override
    public void applyForLoan(double amount) {
            System.out.println("Loaned " + amount + " $");
    }

    @Override
    public String checkLoanStatus() {
        String status = "Pending";
        System.out.println("Loan status " + status);
        return status;
    }
} 
    

