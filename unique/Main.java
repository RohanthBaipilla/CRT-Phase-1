import java.util.*;
public class Main {
    private static void unq1(int[] arr, int k)
    {
        int n=arr.length;
        long sum=0;
        long max = Long.MIN_VALUE;
        Set<Integer> s=new HashSet();
        LinkedList<Integer> l=new LinkedList<>();
        for(int i=0;i<k;i++)
        {
           s.add(arr[i]);
           l.add(arr[i]);
        }
        System.out.println(s.size());
        for(int i=1;i<n-k+1;i++)
        {
            s=new HashSet<>();
            l.removeLastOccurrence(arr[i-1]);
            l.add(arr[i+k-1]);
            s.addAll(l);
            System.out.println(s.size());
        }
    }
    public static void main(String...strings )
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        unq1(arr,k);
    }
}

    
 