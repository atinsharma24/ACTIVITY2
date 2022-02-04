import java.util.Scanner;

public class Q1LA{
    public static void main(String[] args){

        System.out.println("Enter the value of n: ");

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int x=1; x<n+1; x++){

            for(int y=0; y<x; y++){

                System.out.print("* ");
            }

            System.out.println();
        }

        
    }


}