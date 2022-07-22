import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double pos=0,neg=0,z=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
           if(a[i]>0)
           {
               pos++;
           } 
           else if(a[i]<0)
           {
               neg++;
           } 
           else{
               z++;
           }
        }
        
        
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(z/n);
    }
}
