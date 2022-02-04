// DONE

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int size;

        System.out.println("Enter the length of array: ");;

        size = in.nextInt();

        //int pntr = size-1;

        int arr[] = new int[size];

        System.out.println("Enter the value of array elements: ");

        for (int i = 0; i < size; i++) {

            arr[i] = in.nextInt();
            
        }

        System.out.println();

        for (int i = 0; i < size; i++) {

            System.out.print(arr[i] + " ");
            
        }

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                if(arr[i] == arr[j]){

                    for (int j2 = j; j2 < size-1; j2++) {

                        arr[j2] = arr[j2+1];
                        
                    }
                }
                
            }
            
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
            
        }

        in.close();



    }
    
}
