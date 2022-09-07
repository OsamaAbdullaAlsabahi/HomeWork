public class Q4 {
    public static void main(String[] args) {
        float s=1000;
        System.out.println("The Balance Of Your Account For Three Years With a 5% Interest In Every Year = ");
        for(int i=1;i<=3;i++)
        {  s+=(s*.05);
            System.out.println("The Balance Of Your Account After The ["+i+"]Year="+s+"$");
        }

    }
}


