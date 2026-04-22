import java.util.Scanner;

public class array2_modified {
    public static void main(String[] args) {

        int arr[][]= new int[4][3];
        Scanner scan = new Scanner(System.in);
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=(int)(Math.random()*10);
            }
        }
        for(int n[]:arr)
        {
            for(int m: n)
            {
                System.out.print(m);
            }
            System.out.println(" ");
        }

        scan.close();


    }
}

