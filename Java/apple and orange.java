import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        
        int[] apple = new int[m]; //input to apples       
        for(int i=0; i < m; i++){
            apple[i] = in.nextInt() + a;
        }
        
        
        int[] orange = new int[n]; //input to oranges
        for(int i=0; i < n; i++){
            orange[i] = in.nextInt() + b;
        }
        in.close();
        
        
        int numApples = 0;  //initialiaze 2 variables
        int numOranges = 0;
        
        for (int i : apple) {  
            if (i >= s && i <= t) {
                numApples += 1;
            }
        }
        for (int i : orange) {
            if (i >= s && i <= t) {
                numOranges += 1;
            }
        }
        
        System.out.println(numApples);
        System.out.println(numOranges);
    }
}
