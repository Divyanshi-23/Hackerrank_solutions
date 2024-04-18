import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        System.out.println(s1.length()+s2.length());
        if(s1.compareTo(s2)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        s1=s1.replace(s1.charAt(0),Character.toUpperCase(s1.charAt(0)));
        s2=s2.replace(s2.charAt(0),Character.toUpperCase(s2.charAt(0)));
        System.out.print(s1+" "+s2);
    }
}
