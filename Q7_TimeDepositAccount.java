public class Q7_TimeDepositAccount {

    private double  balance;
    private double interest;

    public Q7_TimeDepositAccount(double intiBalance,final double interest ){
        balance=intiBalance;
        this.interest=interest; }


    public void withdraw() {
        balance-=balance;
    }

    public double getBalance() {
        return balance;
    }

    public void addInterest()
    {
        balance=((this.interest/100)*balance)+balance;

    }




}
