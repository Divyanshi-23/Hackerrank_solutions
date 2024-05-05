import java.io.*;
import java.util.*;

class Prime{
    void checkPrime(int... n){
        boolean result = false;
        for(int i: n){
            if(i!=1){
                result=false;
                for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    result=true;
                    break;
                }
            }
            if(result==false){
                System.out.print(i+" ");
            }
            }
            
        }
        System.out.println();
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        int n5=sc.nextInt();
        Prime ob=new Prime();
        ob.checkPrime(n1);
        ob.checkPrime(n1,n2);
        ob.checkPrime(n1,n2,n3);
        ob.checkPrime(n1,n2,n3,n4,n5);
        
        sc.close();
    }
}
