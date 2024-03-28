import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int highestSum= -2147483648;
        int sum=0;
        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        for(int i=0;i<4;i++){
            
            for(int k=0;k<4;k++){
                for(int j=k; j<k+3;j++){
                    sum = sum + arr.get(i).get(j);
                    sum = sum + arr.get(i+2).get(j);
                }
                sum = sum + arr.get(i+1).get(k+1);
                if(sum > highestSum){
                    highestSum = sum;
                }
                sum=0;
            }
        }
        
        System.out.println(highestSum);

        bufferedReader.close();
    }
}
