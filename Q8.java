import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        long x, a, b, c;
        Scanner in =new Scanner(System.in);
            System.out.println("input the number:");
                x=in.nextLong();
//__________________________________
        a =x*x;
             b =x*x*x;
                 c =x*x*x*x;
//__________________________________
        System.out.println("a ="+a);
                  System.out.println("b ="+b);
        System.out.println("c ="+c);
    }
}
