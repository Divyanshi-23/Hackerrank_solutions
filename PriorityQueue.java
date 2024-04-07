import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
class Student{
     int id;
     String name;
     double cgpa;
     
     Student(int id,String name,double cgpa){
         this.id = id;
         this.name = name;
         this.cgpa = cgpa;
     }
     String getName(){
         return this.name;
     }
    public String toString(){
        return this.name;
    }
 }
class Priorities {
    ArrayList<Student> list = new ArrayList<>();
    List<String> eventl = new ArrayList<>();
    
    List<Student> getStudents(List<String> events){
        for(int i=0;i<events.size();i++){
            String s = events.get(i);
            String[] arr = s.split(" ");  
            if(arr[0].equals("SERVED")){
                eventl.add(arr[0]);
            }
            if(arr.length>1){
                Student st = new Student(Integer.parseInt(arr[3]),arr[1],Double.parseDouble(arr[2]));
                list.add(st);
            }
            Collections.sort(list, new Compare());
        
            for(int j=0;j<eventl.size();j++){
                if(list.isEmpty()==false)
                list.remove(0);
                eventl.remove(0);
            }
        } 
        return list;
    }
}
class Compare implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        Double d1 = s1.cgpa;
        Double d2 = s2.cgpa;  
        
        Integer i1= s1.id;
        Integer i2= s2.id;
        
        String fn1= s1.name;
        String fn2= s2.name;
        
        if(d1.compareTo(d2)==0){
            if(fn1.compareTo(fn2)==0){
            return i1.compareTo(i2);
            }
            else{
               return fn1.compareTo(fn2);
            }   
        }
        else{
            return d2.compareTo(d1)  ;
        }
        
    }
}
 

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
