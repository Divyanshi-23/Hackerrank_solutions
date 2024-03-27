import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        BigDecimal[] bd = new BigDecimal[n+2];
        for(int i=0;i<n;i++){
            bd[i] = new BigDecimal(s[i]);
        }
        
        int check=1;
        BigDecimal temp =null;
        for(int i=0;i<n && check==1;i++){
            check=0;
            for(int j=0;j<n-i-1;j++){
                if(bd[j+1].compareTo(bd[j])==1){
                    check=1;
                    temp = bd[j];
                    bd[j]=bd[j+1];
                    bd[j+1]= temp;
                    String st = s[j];
                    s[j] = s[j+1];
                    s[j+1] = st;
                       
                }
            }   
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}

