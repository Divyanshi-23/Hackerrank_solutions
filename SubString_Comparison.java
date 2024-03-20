import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        String subs1 = null;
        String subs2 = null;
        
        String highsub = s.substring(0,k);
        String lowsub = s.substring(0,k);
    
        for(int i=1; i<=((s.length())-k); i++ ){
            subs1= s.substring(i,i+k);
            if(subs1.compareTo(highsub)>=0){
                highsub = subs1;
            }    
        }
        for(int i=1; i<=((s.length())-k); i++ ){
            subs2= s.substring(i,i+k);
            if(lowsub.compareTo(subs2)>=0){
                lowsub = subs2;
            }    
        }
        System.out.println(lowsub);
        System.out.println(highsub);
        
    }

}
