public class Q3_BankAcconntTest {
    public static void main(String[] args) {

        Q3_BankAcconnt a =new Q3_BankAcconnt();
        System.out.println(a.getBalance());
        a.deposit(1000);
        System.out.println(a.getBalance());
        a.withdraw(500);
        a.withdraw(400);

        System.out.println(a.getBalance());
        System.out.println("Expected: 100");
    }
}
