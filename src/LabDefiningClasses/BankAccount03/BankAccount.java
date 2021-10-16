package LabDefiningClasses.BankAccount03;

public class BankAccount {
    public static final double DEFAULT_INTEREST_RATE = 0.02;

    private int id;
    private double balance;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 1;

    public int getId() {
        return id;
    }

    public static void setInterestRate(double interest) {
        BankAccount.interestRate = interest;
    }

    public BankAccount() {
        this.id = bankAccountCount++;
    }

    public void deposit(double amount) {
            this.balance += amount;
    }

    public double getInterest(int years){
        return BankAccount.interestRate * years * this.balance;
    }
}
