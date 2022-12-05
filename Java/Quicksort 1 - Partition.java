import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  //Number of elements
        
        int[] ar = new int[N]; //array 1
        int[] result = new int[N];   //array 2
        
              int p = sc.nextInt();  //takes first element and store it
              

        
        
        int pcount = 1, j = 0;
        
        for (int i = 1; i < N; i++) {
            ar[i] = sc.nextInt();  //input to array
            
            
            if (ar[i] < p)
                {
                result[j] = ar[i];
                j++;
                }
            else if (ar[i] == p)
                pcount++;   
        }
        
        
        for (int i = 0; i < pcount; i++)
            result[j++] = p;
        
        for (int i = 1; i < N; i++) {
            if (ar[i] > p)
                result[j++] = ar[i];
        }
        
        for (int i : result)
            System.out.print(i + " ");
    }
}
