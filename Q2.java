import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        double x, y, nq;    //x:محيط الدايرة     y:مساحة الدايره   nq: نصف القطر
  final double bay =13.4;
        Scanner in =new Scanner(System.in);
            System.out.println("input nq:");
                nq =in.nextDouble();
//_____________________________
                 x =2*bay*nq;
            System.out.println("x ="+x);
     y =bay*(nq*nq);
            System.out.println("y ="+y);
//______________________________________
    }
}
