
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int s1 = 0; s1 < n; s1++){
            int grade = in.nextInt();
            if (grade >= 38) {
                if (grade%5 >= 3) 
                    grade += 5 - (grade % 5);
                    
            }
            System.out.println(grade);
        }
        in.close();
    }
}
