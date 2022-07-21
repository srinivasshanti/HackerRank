import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long[] m=new long[5];
        for(int i=0;i<5;i++){
            m[i]=in.nextLong();
        }
        Arrays.sort(m);     //from smallest to largest 
        in.close();
        long min=0;
        long max=0;
        
        //it will leave the last largest element so obvious we will get minimum sum
        for(int i=0;i<4;i++){
            min+=m[i];
        }
        
        //it will leave the last smallest element so obvious we will get maximum sum
        for(int i=1;i<5;i++){
            max+=m[i];
        }
        System.out.println(min+" "+max);
    }
}
