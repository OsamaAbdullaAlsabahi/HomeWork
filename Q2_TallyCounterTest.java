public class Q2_TallyCounterTest {
    public static void main(String[] args) {

        Q2_TallyCounter x=new Q2_TallyCounter();

    x.setLimit(5);
            x.click();
                 x.click();
                       x.click();
                 x.click();
            x.click();
    x.click();

        System.out.println(x.getClick());

    }
}
