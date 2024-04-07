import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int op = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> i1= new ArrayList<>();
        ArrayList<Integer> i2= new ArrayList<>();
        
        int count1=0;
        int count2=0;
        
        for(int i=0;i<op;i++){
            list.add(sc.next());
            i1.add(sc.nextInt());
            i2.add(sc.nextInt());
        }
        
        BitSet b1 = new BitSet(size);
        BitSet b2 = new BitSet(size);
        
        for(int i=0;i<size;i++){
            b1.set(i,false);
            b2.set(i,false);     
        }
        for(int i=0; i<op ;i++){
            count1=0;
            count2=0;
            if(list.get(i).equals("AND")){
                if(i1.get(i)==1){
                    b1.and(b2);
                }
                else{
                    b2.and(b1);
                }
            }
            if(list.get(i).equals("OR")){
                if(i1.get(i)==1){
                    b1.or(b2);
                }
                else{
                    b2.or(b1);
                }
            }
            if(list.get(i).equals("SET")){
                if(i1.get(i)==1){
                    b1.set(i2.get(i));
                }
                else{
                    b2.set(i2.get(i));
                }
            }
            if(list.get(i).equals("FLIP")){
                if(i1.get(i)==1){
                    b1.flip(i2.get(i));
                }
                else{
                    b2.flip(i2.get(i));
                }
            }
            if(list.get(i).equals("XOR")){
                if(i1.get(i)==1){
                    b1.xor(b2);
                }
                else{
                    b2.xor(b1);
                }
            }
            for(int j=0;j<=size;j++){
                if(b1.get(j)==true){
                    count1++;
                }
                if(b2.get(j)==true){
                    count2++;
                }
            }
            System.out.println(count1+" "+count2);
        } 
        sc.close();
    }
}
