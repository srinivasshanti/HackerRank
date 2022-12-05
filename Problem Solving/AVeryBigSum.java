import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class BigSum {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in)       ;
     int n=sc.nextInt();
     long sum=0;
     while(n>0)
     {
         sum+=sc.nextInt();
         n--;
     }
      System.out.println(sum);
        
    }
}
