import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("input three number:");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        System.out.println("----------------");
        if (x<y & y<z) System.out.println("|  increasing  |");
            else if (x>y & y>z) System.out.println("|  decreasing  |");
        else System.out.println("|   neither    |");

        System.out.println("----------------");


    }

}
