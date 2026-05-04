public class compareTo {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Sachintendulkar";
        int a = s2.compareTo(s1);//s2-s1
        System.out.println(a);
        if(a==0) System.out.println("both are same");
        else if(a>0) System.out.println("s2 is greater than s1");
        else if(a<0) System.out.println("s1 is greater than s2");

    }
}
