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
        
        int[] apple = new int[m];
        
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt() + a;
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt() + b;
        }
        in.close();
        int numApples = 0;
        int numOranges = 0;
        for (int app : apple) {
            if (app >= s && app <= t) {
                numApples += 1;
            }
        }
        for (int ora : orange) {
            if (ora >= s && ora <= t) {
                numOranges += 1;
            }
        }
        System.out.println(numApples);
        System.out.println(numOranges);
    }
}
