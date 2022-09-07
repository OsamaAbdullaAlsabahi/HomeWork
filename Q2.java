import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {

    int num;
       String c;
          String color="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the character and the number to see if the space black or white");
        c=in.next();
        num=in.nextInt();
        //----------------------------------------------------------------------
        if(c.equals("a")||c.equals("c")||c.equals("e")||c.equals("g"))
        {
            if(num<=8 && num>=1 && num%2==1)
               color="black";
            else if (num<=8 && num>=1 && num%2==0)
               color="white";
        System.out.println(color);
        }
        //----------------------------------------------------------------------

        else  if(c.equals("b")||c.equals("d")||c.equals("f")||c.equals("h"))
        {
            if(num<=8 && num>=1 && num%2==0  )
               color="black";
            else if (num<=8 && num>=1 && num%2==1)
               color="white";
        System.out.println(color);
        }
        //----------------------------------------------------------------------
        else
        System.out.println("(Error) retry again:");

    }

}





