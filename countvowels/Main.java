import java.util.Scanner;
public class Main
{
    static int countVowels(String s)
    {
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String s;
		s = sc.next();
		System.out.println("Vowels Count is = "+countVowels(s));
	}
}
