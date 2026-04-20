import java.util.Scanner;

public class modified_switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day: ");
        String s = scan.next();
        
        switch (s) {
            case "Sunday","Saturday" -> System.out.println("Holiday");
            default -> System.out.println("9 to 5 work");
        }

        System.out.println("Enter your grade: ");
        char ch = scan.next().charAt(0);

        String abc =switch (ch) {
            case 'A' : yield "90 to 100";
            case 'B' : yield "80 to 90";
            case 'C' : yield "70 to 80";
            default : yield "invalid";
        
        };

        System.out.println(abc);
        scan.close();


    }
}
