import java.util.Scanner;

public class Q3 {

    public static float avg(int arr[], int n){

        int sum = 0;

        for(int x=0; x<n; x++){

            sum += arr[x];
        }

        return sum/n;

    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int m, p, c, e, cs;

        System.out.println("Enter marks of Maths Physics Chemistry English and Computer Science respectively: ");;
        m = in.nextInt();
        p = in.nextInt();
        c = in.nextInt();
        e = in.nextInt();
        cs = in.nextInt();

        float oa, ea;

        sysout("Overall average marks is: ");
        System.out.println(avg({m, p, c, e, cs}, 5));
        System.out.println("Engineering average marks is: " + (2*m + p + (c/4)));
        System.out.println("computer science average is: " + cs);

        in.close();

        

    }
    
}
