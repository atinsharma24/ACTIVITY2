import java.util.Scanner;

public class Q2LA {
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n: ");

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int x=1; x<n; x++){

            for(int y=0; y<x; y++){

                System.out.print("* ");
            }
            
            for(int y=0; y<2*(n-x)-1; y++){

                System.out.print("  ");
            }

            for(int y=0; y<x; y++){

                System.out.print("* ");
            }
            System.out.println();

        }
        for(int y=0; y< 2*n - 1; y++){

            System.out.print("* ");
        }
        System.out.println();
        for(int x=n-1; x>0; x--){

            for(int y=0; y<x; y++){

                System.out.print("* ");
            }
            
            for(int y=0; y<2*(n-x)-1; y++){

                System.out.print("  ");
            }

            for(int y=0; y<x; y++){

                System.out.print("* ");
            }
            System.out.println();

        }
        in.close();
    }
    
}