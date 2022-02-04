// DONE

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int size;

        System.out.println("Enter the size of matrix1: ");

        size = in.nextInt();

        int mat1[][] = new int[size][size];

        System.out.println("Enter the elements of the matrix1 line by line: ");

        for (int i = 0; i < size; i++) {

            System.out.print("Enter " + (i+1) + " row elements: ");

            for (int j = 0; j < size; j++) {

                mat1[i][j] = in.nextInt();
                
            }
            
        }

        System.out.println("Entered matrix1 is: ");

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                System.out.print(mat1[i][j] + " ");;
                
            }
            System.out.println();            
        }

        int mat2[][] = new int[size][size];

        System.out.println("Enter the elements of the matrix2 line by line: ");

        for (int i = 0; i < size; i++) {

            System.out.print("Enter " + (i+1) + " row elements: ");

            for (int j = 0; j < size; j++) {

                mat2[i][j] = in.nextInt();
                
            }
            
        }

        System.out.println("Entered matrix2 is: ");

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                System.out.print(mat2[i][j] + " ");;
                
            }
            System.out.println();            
        }

        int summat[][] = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                summat[i][j] = mat1[i][j] + mat2[i][j];
                
            }
        }

        System.out.println("Sum of two matrix is: ");

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                System.out.print(summat[i][j] + " ");;
                
            }
            System.out.println();            
        }

        in.close();


    }
    
}
