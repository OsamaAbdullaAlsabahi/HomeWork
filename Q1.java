public class Q1 {
    public static void main(String[] args) {

        // (1)
        int n = 1;
        int m = -1;
        if (n < -m)
        { System.out.println(n); }
        else { System.out.println(m); }

        // (2)
        int a = 1;
        int b = -1;
        if (-a >= b)
        { System.out.println(a); }
        else { System.out.println(b); }

        // (3)
        double c = 0;
        double d = 1;
        if (Math.abs(c - d) < 1)
        { System.out.println(c); }
        else { System.out.println(d); }

        // (4)
        double z = Math.sqrt(2);
        double w = 2;
        if (z * z == w)
        { System.out.println(z); }
        else { System.out.println(w); }

    }

}
