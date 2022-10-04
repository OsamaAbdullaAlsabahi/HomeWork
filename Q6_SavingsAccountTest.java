public class Q6_SavingsAccountTest {
    public static void main(String[] args) {

        Q6_SavingsAccount a = new Q6_SavingsAccount(1000 ,10);

        a.addInterest();
        System.out.println("expected is 1100");
        System.out.println(a.getBalance());


    }
}
