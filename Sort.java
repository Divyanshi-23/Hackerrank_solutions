import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
class Comparison implements Comparator<Student>{
    public int compare(Student s1,Student s2){ 
        Double d1 = s1.getCgpa();
        Double d2 = s2.getCgpa();  
        Integer i1= s1.getId();
        Integer i2= s2.getId();
        String fn1= s1.getFname();
        String fn2= s2.getFname();
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

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        Collections.sort(studentList,new Comparison());
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



