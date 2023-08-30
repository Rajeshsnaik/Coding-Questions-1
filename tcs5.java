//check prime or not
import java.util.Scanner;

public class tcs5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        boolean flag=false;
        for (int i=2; i<n; i++) {
            if(n%i == 0)
            {
                flag=true;
            }}
        if(flag==true)
            System.out.println("non-prime");
        else
            System.out.println("prime");
        
}
}
