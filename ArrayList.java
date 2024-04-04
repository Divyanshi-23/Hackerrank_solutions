import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> list1 = new ArrayList<>();
        ArrayList<int[]> list2 = new ArrayList<>();
        int result=0;
        int flag=0;
        int count= sc.nextInt();   
        while(count!=0){
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            
            list1.add(arr);
            count--;
        }
        
        
        count= sc.nextInt();
        while(count!=0){
            int[] arr = new int[2];
            for(int i=0;i<2;i++){
                arr[i]= sc.nextInt();
            }
            list2.add(arr);
            count--;
        }
       
        for(int i=0;i<list2.size();i++){
            int[] arr1=list2.get(i);
            
            int[] arr2= list1.get(arr1[0]-1);
                    try{
                        result=arr2[arr1[1]-1];
                    }
                    catch(Exception e){
                        System.out.println("ERROR!");
                        flag=1;
                    }
                
                if(flag==0){
                    System.out.println(result);
                } 
                flag =0;
        }
    }
    
}
