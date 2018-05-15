package introduction;

import java.util.Scanner;

public class Loops2 {
    public static void main(String []argh){
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        
        for (int i = 0; i < q; i++) {
            int c = 0;
            
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            for (int j = 0; j < n; j++) {
                c = a;
                
                for (int k = 0; k <= j; k++) {
                    c = (int) (c + (Math.pow(2, k)) * b);
                }
                
                System.out.print(c + " ");
            } 
            
            System.out.println();
        }
        
        scan.close();
    }
}