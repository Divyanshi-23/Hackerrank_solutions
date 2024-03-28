import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum=0;
        int count=0;
        int size= sc .nextInt();
        int[] array = new int[size];
        
        for (int i=0; i<size;i++){
            array[i]= sc.nextInt();
        }
        
        for (int i=1; i<=size ;i++){
            int[] tarr= new int[i];
            int l = 0;
            for(int j=size-i;j>=0;j--){
                for(int k=0;k<tarr.length;k++){   
                    tarr[k] =array[l++];
                }
                for(int k=0;k<tarr.length;k++){
                    sum+= tarr[k];
                }
    
                if(sum<0){
                    count++;
                }
                sum=0;
                l=l-(i-1);
            }
        }
        System.out.println(count);
        sc.close();
    }
}
