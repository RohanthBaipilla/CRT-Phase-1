import java.util.Scanner;

public class Main
{
    static boolean isAlpha(char ch)
    {
        if(ch >= 'a' && ch <= 'z')
        {
            return true;
        } 
        else if(ch >= 'A' && ch <= 'Z')
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        boolean containsAlphabets = false;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(isAlpha(ch)) {
                containsAlphabets = true;
                break;
            }
        }
        
        if(containsAlphabets) {
            System.out.println("The string contains String.");
        } else {
            System.out.println("The string does not contain string.");
        }
    }
}

