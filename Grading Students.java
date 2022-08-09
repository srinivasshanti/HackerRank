import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        int g=sc.nextInt();
        if(g>=38)
        {
            if(g%5 >=3)     //check if reminder is > or == 3
            g=g/5*5+5;      //if the above sentence is satisfied then round off
        }
        System.out.println(g);
        }
    }
}
