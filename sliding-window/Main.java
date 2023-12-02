import java.util.*;
public class Main {
 public static void main(String...strings )
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++)
   arr[i]=sc.nextInt();
  System.out.println(maxWinSum1(arr,k));
 }

 private static long maxWinSum(int[] arr, int k)
 {
  int n=arr.length;
  long sum=0;
  long max = Long.MIN_VALUE;
  for(int i=0;i<k;i++)
   sum+=arr[i];
  for(int ws=1;ws<n-k+1;ws++)
  {
   sum=sum-arr[ws-1]+arr[ws+k-1];
   max=Math.max(sum, max);
  }
  return max; 
 }
 private static long maxWinSum1(int[] arr, int k)
 {
  int n=arr.length;
  long sum=0;
  long max = Long.MIN_VALUE;

  for(int i=0;i<n-k+1;i++)
  {
   sum=0;
   for(int j=0;j<k;j++)
   {
    sum+=arr[i+j];
   }
   max=Math.max(max, sum);
  }
  return max;
 }
 private static void demo(int[] arr, int k)
 {
  int n=arr.length;
  long sum=0;
  long max = Long.MIN_VALUE;
  int si=0;
  int ei=k-1;
  for(int i=0;i<k;i++)
  {
   sum+=arr[i];
  }
  
  for(int ws=1;ws<n-k+1;ws++)
  {
   sum=sum-arr[ws-1]+arr[ws+k-1];
   if(sum>max)
   {
    max=sum;
    si=ws;
    ei=ws+k-1;
   }
  }
  System.out.println(max+" "+si+" "+ei); 
 }
}
