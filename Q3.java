import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        double x, y, w, l;    //x:محيط المستطيل     y:مساحة المستطيل
        final double bay =13.4;
        Scanner in =new Scanner(System.in);
            System.out.println("input the width:");
                 w=in.nextDouble();

   System.out.println("input the height:");
        l=in.nextDouble();
//_________________________________
    x =2*(w+l);
        System.out.println("x ="+x);
    y =w*l;
        System.out.println("y ="+y);
//________________________________________
    }

}
