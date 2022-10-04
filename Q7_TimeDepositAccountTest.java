public class Q7_TimeDepositAccountTest {

    public static void main(String[] args) {
        Q7_TimeDepositAccount x=new Q7_TimeDepositAccount(1000,5);

        x.addInterest();
        System.out.println(x.getBalance());

        x.withdraw();
        System.out.println(x.getBalance());
    }

}
