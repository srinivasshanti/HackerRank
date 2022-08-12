import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        if(arr[n-1]>k)
        {
         count=arr[n-1]-k;   
        }
        System.out.println(count);
        
    }
}
