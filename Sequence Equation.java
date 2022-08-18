import java.util.*;


public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];  //array
        
        
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();//input to array
            
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i==a[j]){
                  for(int k=0;k<n;k++)  {
                      if((j+1)==a[k])
                          System.out.println(k+1);
                  }
                }
            }
        }
    }
}
