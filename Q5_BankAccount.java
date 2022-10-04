public class Q5_BankAccount {

    private double balance;
    public Q5_BankAccount()
    {balance = 0;}
    public Q5_BankAccount(double initBalance)
    {balance = initBalance;}

    public void deposit(double amount) {
        balance+=amount;
    }
    public void withdraw(double amount) {
        balance-=amount;
    }
    public double getBalance() {
        return balance;
    }

    public void mystery(Q5_BankAccount that, double amount) {

        this.balance = this.balance - amount;
        that.balance = that.balance + amount;
    }

    public void addInterest(double interest)
    {

        balance=((interest/100)*balance)+balance;

    }

}