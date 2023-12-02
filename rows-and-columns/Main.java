import java.util.*;
class Main
{
    public static void main (String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int r = 4;
        int c = 4;
        int x = 2;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(x+" ");
            }
            x = x+2;
            System.out.println();
        }
    }
}