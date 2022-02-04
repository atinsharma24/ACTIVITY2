// DONE

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int size;

        System.out.println("Enter the size of matrix: ");

        size = in.nextInt();

        int mat[][] = new int[size][size];

        System.out.println("Enter the elements of the matrix line by line: ");

        for (int i = 0; i < size; i++) {

            System.out.print("Enter " + (i+1) + " row elements: ");

            for (int j = 0; j < size; j++) {

                mat[i][j] = in.nextInt();
                
            }
            
        }

        System.out.println("Entered matrix is: ");

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                System.out.print(mat[i][j] + " ");;
                
            }
            System.out.println();            
        }

        int arr[] = new int[size];

        int sum = 0;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                sum += mat[i][j];
                
            }
            arr[i] = sum;
            sum = 0;
            
        }

        System.out.println("The sum of rows of matrix is: ");

        for (int i = 0; i < size; i++) {
            
            System.out.print(arr[i] + " ");
        }


        in.close();

    }

    
}
