import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int i=0; i < n; i++)
        {
            h[i] = in.nextInt();
        }
        
        String word = in.next();
        int m=word.length();
        int mx = 0;
        for (int i = 0; i < m; i++) {
            int loc=word.charAt(i)-'a';
            int f = h[loc];  //from this we will get the number representing that particular alpahabet in array h
            //Subtracting 'a' (or, 97) scales each letter in the alphabet to the 0-26 range that corresponds to the "buckets" in the arr array.
            
            if (f > mx) {
                mx = f;
            }
        }
        System.out.println((word.length() * mx));
    }
}
