import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        
		while(testCases-->0){
			String line = in.nextLine();
			
			Matcher matcher = Pattern.compile("<(.+)>(([^<>]+))</\\1>").matcher(line);  
            // print none when nothing found in matcher  
            if (matcher.find() == false) {  
                System.out.println("None");  
                continue;  
            }  
            // reset matcher  
            matcher.reset();  
            // repeat step until matcher find data  
            while (matcher.find() == true){  
                System.out.println(matcher.group(2));  
            }  
	
		}
        in.close();
	}
    
}



