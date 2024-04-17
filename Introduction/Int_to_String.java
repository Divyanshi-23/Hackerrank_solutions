import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        String s = String.valueOf(num);
        
        if(num == Integer.parseInt(s)){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
    }
}
