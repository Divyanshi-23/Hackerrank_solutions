import java.io.*;
import java.util.*;

public class Solution {
    static <T>void printArray(ArrayList<T> t){
        for(int i =0 ; i<t.size(); i++){
            System.out.println(t.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        str.add("Hello");
        str.add("World");
        
        Solution.printArray(arr);
        Solution.printArray(str);
    }
}
