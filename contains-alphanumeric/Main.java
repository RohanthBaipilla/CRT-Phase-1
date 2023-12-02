import java.util.Scanner;

public class Main {
    static boolean isAlphaNumeric(char ch) {
        if(ch >= 'a' && ch <= 'z') {
            return true;
        } else if(ch >= 'A' && ch <= 'Z') {
            return true;
        } else if(ch >= '0' && ch <= '9') {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        boolean containsAlphaNumeric = false;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(isAlphaNumeric(ch)) {
                containsAlphaNumeric = true;
                break;
            }
        }
        
        if(containsAlphaNumeric) {
            System.out.println("The string contains alphanumeric characters.");
        } else {
            System.out.println("The string does not contain alphanumeric characters.");
        }
    }
}