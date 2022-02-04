//DONE

import java.util.Scanner;

public class Q4{

    public static int[] swap(int[] arr, int a, int b){

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        return arr;
    }


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array: ");

        int size;

        size = in.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter values of array: ");

        for(int x=0; x<size; x++){

            arr[x] = in.nextInt();
        }

        for(int x=0; x<size; x++){

            System.out.print(arr[x] + " ");
        }
        System.out.println();

        boolean chk = true;

        while(chk = true){

            chk = false;
            int x;

            for(x=0; x<=size-2; x++){
                

                if(arr[x] > arr[x+1]){

                    swap(arr, x, x+1);
                    chk = true;
                }
            }
            if(chk == false){
                break;
            }
        }

        for(int x=0; x<size; x++){

            System.out.print(arr[x] + " ");
        }

        in.close();

    }
    
}
