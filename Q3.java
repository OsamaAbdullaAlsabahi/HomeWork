import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input the num");
        int x = in.nextInt();
        if (x>0) System.out.println(x+" positive");
        else if (x<0)System.out.println(x+" negative");
        else System.out.println(x+" this zero");
    }

}
