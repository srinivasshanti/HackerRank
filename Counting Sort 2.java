
import java.util.*;


public class Solution {

       
    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
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
        for(int i = 0; i <ar.length ;i++){
            while(ar[i] > 0){
                System.out.print(i + " ");
                ar[i]--;
            }
        }
        
    }
}
