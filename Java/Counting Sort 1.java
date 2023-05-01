
import java.util.*;


public class Solution {
    
    static void printArray(int[] ar) {
        for (int i : ar) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[100];
        for (int i = 0; i < n; i++) {
            ar[in.nextInt()]++;
        
        }
        
        
        printArray(ar);
    }

}








