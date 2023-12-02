import java.util.Scanner;

public class Main {
    
    static int countDigits(long n)
    {
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        System.out.print("Total Digits = "+countDigits(n));
        
        
    }
}