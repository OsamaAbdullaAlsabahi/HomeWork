public class Q3_BankAcconnt {
    private double balance;
    public Q3_BankAcconnt()
    {balance = 0;}
    public Q3_BankAcconnt(double initBalance)
    {balance = initBalance;}

    public void deposit(double amount){
        balance = balance+amount;
    }
    public void withdraw(double balance){
        this.balance = this.balance -balance;
    }

    public double getBalance() {
        return balance;
    }

}
