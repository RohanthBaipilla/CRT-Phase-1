/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    int r,c;
	    r = s.nextInt();
	    c = s.nextInt();
	    for(int i=1;i<=r;i++)
	    {
	        for(int j=1;j<=c;j++)
	        {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
		
	}
}
