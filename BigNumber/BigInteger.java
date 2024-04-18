import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger b1 = new BigInteger(sc.nextLine());
        BigInteger b2 = new BigInteger(sc.nextLine());
        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
    }
}
