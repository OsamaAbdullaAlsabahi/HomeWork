public class Q6_SavingsAccount {

    private double balance;
    private double interest;

    public Q6_SavingsAccount()
    {balance = 0;}
    public Q6_SavingsAccount(double initBalance ,double interest )
    {
        balance = initBalance;
        this.interest=interest;
    }

    public void deposit(double amount){
        balance = balance+amount;
    }
    public void withdraw(double balance){
        this.balance = this.balance -balance;
    }

    public double getBalance() {
        return balance;
    }
    public void addInterest()
    {

        balance = (( this.interest / 100) * balance) + balance;

    }


}
