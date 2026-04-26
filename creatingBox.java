import java.util.Scanner;

public class creatingBox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++)
        {
            System.out.printf("*");
        }
        System.out.println(" ");
    }
    scan.close();
}

}
