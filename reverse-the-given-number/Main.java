import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = (long)sc.nextLong();
        long r,sum=0,temp;    
        temp=n;    
        while(n>0)
        {    
           r=n%10;
           sum=(long)(sum*10)+r;    
           n=n/10;    
        } 
        System.out.println("Reverse number = "+ sum);
    }
}
