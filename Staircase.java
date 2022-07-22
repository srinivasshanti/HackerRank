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
        int level=n-1;
        //using string builder to manipulate strings
        for(int k=0;k<n;k++){
        StringBuilder s = new StringBuilder();
        
        for(int i=0;i<level;i++)
        {
            s.append(" ");
        }
        for(int i=0;i<n-level;i++)
        {
            s.append("#");
        }
        level=level-1;
        System.out.println(s.toString());
        
        
        sc.close();
        }
    }
}
