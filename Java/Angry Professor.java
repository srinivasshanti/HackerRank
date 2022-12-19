import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();  //input 1
        for(int i=0;i<a;i++)
        {
            int count=0;
            int n=sc.nextInt();    //input 2
            int k=sc.nextInt();    //input 3
            
            for(int j=0;j<n;j++)
            {              
                int arr=sc.nextInt();
                if(arr<=0)
                {
                    count++;
                      
                }
            }
                          
            if(count<k)  //it has to be less then threshold to conduct class
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
    }
}
