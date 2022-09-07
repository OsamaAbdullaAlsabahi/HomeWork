import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("input three number:");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        System.out.println("----------------");
        if (x==y & x==z) System.out.println("| all the same |");
            else if (x!=y & x!=z) System.out.println("| all different|");
        else System.out.println("|   neither    |");

        System.out.println("----------------");
    }

}
