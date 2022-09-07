import java.util.Scanner;
import javax.swing.JOptionPane;
public class Q8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("name the employee: ");
        String name = in.next();

        double salary = 9.25;
     //   System.out.println("input hourly wage:");
     //   int salary = in.nextInt();

        System.out.println("how many hours the employee worked in the past week:");
        double hours = in.nextDouble();

        System.out.println("Name the employee : "+name);
        System.out.println("the pay = "+(hours * salary)+"$");

    }

}
