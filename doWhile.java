import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("enter the value of n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
