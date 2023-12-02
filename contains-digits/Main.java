import java.util.Scanner;

public class Main
{
    static boolean isDigits(char ch)
    {
        if(ch >= '0' && ch <= '9') {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        boolean containsDigits = false;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(isDigits(ch)) {
                containsDigits = true;
                break;
            }
        }
        
        if(containsDigits) {
            System.out.println("The string contains digits.");
        } else {
            System.out.println("The string does not contain digits.");
        }
    }
}

