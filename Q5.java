import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        int x, y, z;
        Scanner in =new Scanner(System.in);
             System.out.print("input x:");
                     x=in.nextInt();

             System.out.print("input y:");
                  y=in.nextInt();
//_______________________________
        z=x;
        x=y;
        y=z;

        System.out.println("the value of x is :"+x);
System.out.println("the value of x is :"+y);
//________________________________________
    }
}
