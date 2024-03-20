import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int mid =A.length()/2;
        int flag=0;
        int j = A.length()-1;
        
        for(int i=0;i<mid;i++){
            if((A.charAt(i))!=(A.charAt(j))){
                flag=1;
                break;
            }
            else{
                j--;
            }
        }
        if(flag==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
