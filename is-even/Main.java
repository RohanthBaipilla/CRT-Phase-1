import java.util.Scanner;

public class Main {
    static void isEven(long n)
    {
        if(n%2==0)
        {
            System.out.println("True...! It's Even");
        }
        else
        {
            System.out.println("False...! It's Odd");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
        long n = sc.nextLong();
        isEven(n);
        
    }
}