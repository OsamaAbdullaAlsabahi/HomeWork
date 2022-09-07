import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("input three number:");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        System.out.println("----------------");
if (x<y & y<z) System.out.println("("+x+" "+y+" "+z+") in order");
else if (x>y & y>z) System.out.println("("+x+" "+y+" "+z+") in order");
else System.out.println("("+x+" "+y+" "+z+") not in order ");

        System.out.println("----------------");



    }

}
