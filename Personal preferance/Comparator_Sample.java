import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Sample {
	
	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<>();
		
		list.add(new Student(56,67));
		list.add(new Student(47,75));
		list.add(new Student(31,86));
		list.add(new Student(28,98));
		
//		Comparator<Integer> com=new Comparator<Integer>()
//		{
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				
//				return o1%10 > o2%10 ? 1 : 0;
//			}
//		};
		
		Collections.sort(list,(s1,s2)->
		{
			return s1.marks > s2.marks ? -1 : s1.marks < s2.marks ? 1 : 0;
		});
		
		for(Student s : list)
		{
			System.out.println(s);
		}
		
	}
}
	
class Student
{
	int roll,marks;

	public Student(int roll, int marks) {
		super();
		this.roll = roll;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", marks=" + marks + "]";
	}
	
	
}