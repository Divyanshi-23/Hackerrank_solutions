import java.io.*;
import java.util.*;

public class Solution {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int length= sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<length;i++){
            int x = sc.nextInt(); 
            arr.add(x);
        }
        int query= sc.nextInt();
    
        for(int i=0; i<query;i++){
            String s =sc.next();
            if(s.equals("Insert")){
                int index = sc.nextInt();
                int value = sc.nextInt();
                arr.add(index,value);
            }
            else if(s.equals("Delete")){
                int index = sc.nextInt();
                arr.remove(index);
            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        
        sc.close();
    }
}
