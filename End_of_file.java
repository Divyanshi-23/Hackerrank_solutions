import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("abc.txt");
        try{
            FileWriter fw = new FileWriter(file);
            while(sc.hasNext()){
            fw.write(sc.nextLine());
            fw.flush();
            fw.write("\n");
            fw.flush();
            }            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try{
          
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String str = null;
            int count = 1;
            
            while((str=br.readLine())!=null){ 
                System.out.println(count + " " + str);
                count++;
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
