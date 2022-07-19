import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int max = 0;
        int count = 0;//sum
        int initial;//num
        
        
        for(int i =0; i < n; i++){
            initial = in.nextInt();
            if(initial > max){
                count = 1;
                max = initial;
            }
            else if(initial == max){
                count++;
            }
        }
        System.out.println(count);
    }
}
