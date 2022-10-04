public class Q5_BankAccountTest {
    public static void main(String[] args) {

        Q5_BankAccount Ali=new Q5_BankAccount(500);
        Q5_BankAccount Osama=new Q5_BankAccount(1000);

        Osama.mystery(Ali,500);

        System.out.println("Osama balance :"+Osama.getBalance());
                 System.out.println("Ali balance :"+Ali.getBalance());




    }
}
