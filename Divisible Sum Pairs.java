import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int cnt=0;
        for (int i = 0 ;i<n-1;i++) {
            for (int j=i+1;j<n;j++) {
                if ((arr[i]+arr[j]) % k == 0)    //add number and divide by k if its reminder is 0 count++
                    cnt ++;
            }
        }
        System.out.println(cnt);
    }
}
