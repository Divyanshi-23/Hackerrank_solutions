import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int count1=0;
        int count2=0;
        int flag=0;
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()==s2.length()){
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            for(int j=0; j<s1.length(); j++){
                if(s1.charAt(j)==ch){
                    count1++;
                }
            }
            for(int j=0; j<s2.length(); j++){
                if(s2.charAt(j)==ch){
                    count2++;
                }
            }
            if(count1 != count2){
                flag=1;
                break;
            }
        }
            
        if(flag==0){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}
