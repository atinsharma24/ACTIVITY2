// DONE

import java.util.Scanner;

public class Q6 {
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

        int i;

        for (i = 0; i < size; i++) {

            if(mat[i][i] != 1){

                System.out.println("breaking " + i + " index");
                break;
            }
                
        }

        System.out.println("Value of i is: " + i);

        if(i == size){

            System.out.println("IT IS IDENTITY MATRIX.");
        }
        else{

            System.out.println("NOT IDENTITY MATRIX TRY AGAIN!!");
        }
    
        in.close();
    }

}
