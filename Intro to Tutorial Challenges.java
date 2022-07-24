import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int cas = sc.nextInt();  
        
       int[] ar = new int[cas];  
        
        
        for(int i = 0;i<cas; i++)
        {
            ar[i]=sc.nextInt();
        }
        
        for(int n = 0; n < cas;n++)
        {
            if(ar[n] == value)
                System.out.println(n);
        }sc.close();
    }
}


//Using Array List
/*import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int value = sc.nextInt(); //V
        int cas = sc.nextInt();  //size of array
        
        ArrayList<Integer> ar = new ArrayList<Integer>();  //using array list
        
        
        for(int i = 0;i<cas; i++)
        {
            ar.add(sc.nextInt());
        }
        
        for(int n = 0; n < ar.size();n++)
        {
            if(ar.get(n) == value)
                System.out.println(n);
        }sc.close();
        
        
    }
}*/
