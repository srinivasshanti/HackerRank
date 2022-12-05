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
        
        for (int i =1; i <n; i++) 
        {
            temp = array[i];     //storing the value of array at position i in temp
            for(int j=i-1;j>=0;j--)
            {
            if (array[j] > temp)
            {
                array[j+1] = array[j];                                    
                array[j] = temp;                                            
            }
            }
            
            for(int j=0;j<n;j++)
                System.out.print(array[j]+" ");
            System.out.println();
        }
        
        
        
        
    }
}

