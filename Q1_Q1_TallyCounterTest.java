public class Q1_Q1_TallyCounterTest {

    public static void main(String[] args) {

        Q1_TallyCounter x=new Q1_TallyCounter();
        x.click();
            x.click();
                 x.click();
                       x.click();
                       x.click();
                   x.undo();
             x.undo();
        x.undo();

        System.out.println(x.getClick());



}
    }
