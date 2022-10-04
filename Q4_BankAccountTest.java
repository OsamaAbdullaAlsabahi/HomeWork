public class Q4_BankAccountTest {
    public static void main(String[] args) {

        Q4_BankAccount momsSavings = new Q4_BankAccount(1100,10);

        momsSavings.addInterest();
        System.out.println("$"+momsSavings.getBalance());

        System.out.println("expected result is :1210");

    }
}
