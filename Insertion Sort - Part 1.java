import java.util.*;



public class Solution { 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int[] array = new int [n];
         
         for(int i=0;i<n;i++)
         {
             array[i]=sc.nextInt();
         }
        sc.close();
        int temp;
        
        for (int i = n - 1; i > 0; i--) 
        {
            temp = array[i];//storing the value of array at position i in temp

            if (array[i - 1] > temp)
            {
                array[i] = array[i - 1];
                    for ( int ii : array) 
                    {
                        System.out.print(ii);
                        System.out.print(" ");
                    }
                    System.out.println("");
                
                array[i - 1] = temp;
            }
        }
        
        for (int i : array) {
            System.out.print(i);
            System.out.print(" ");
        }
        
        System.out.println("");
        
        
    }
}
