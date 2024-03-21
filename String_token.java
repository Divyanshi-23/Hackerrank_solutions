import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count=0;
        String[] ts = s.split("[!,.@'! ?_]");
        for(String t : ts){
            if(t.isEmpty()==false)
               count++;
        }
        System.out.println(count);
        for(String t : ts){
            if(t.isEmpty()==false)
               System.out.println(t);
        }
        scan.close();
    }
}

