
import java.util.*;

public class Main {

	static void decToOctal(int n)
	{
		
		int octalNum [] = new int[100];
		int i = 0;
		while (n>0) 
		{
			octalNum[i] = n % 8;
			n = n / 8;
 			i++;
		}

		for (int j = i - 1; j >= 0; j--)
		{
		    System.out.print(octalNum[j]);
		}
			
	}


	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0)
	    {
	        int n = sc.nextInt();
		    decToOctal(n);
	    }
		
	}
}
