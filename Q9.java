import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
    int x, y;

        Scanner in =new Scanner(System.in);
        System.out.print("input the x:");
            x=in.nextInt();

        System.out.print("input the y:");
             y=in.nextInt();

        System.out.println("The sum ="+(x+y));
             System.out.println("The difference ="+(x-y));
                 System.out.println("The product ="+(x*y));
                       System.out.println("The average ="+((x+y)/2.0));
//__________________________________________
        if ((x-y)<0)
        {
            System.out.print("The distance :");
                System.out.println(-(x-y));
        }
                    else System.out.println(x-y);
//_______________________________________________
            if (x>y) System.out.println("The maximum :"+x);
else System.out.println("The maximum :"+y);
//__________________________________
            if (x<y) System.out.println("The minimum :"+x);
else System.out.println("The minimum :"+x);


    }
}
