import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Comparator_Student {
	
	public static void main(String[] args) {
		
		
		List<Comparator_Student_Profile> student=new ArrayList<>();
		
		student.add(new Comparator_Student_Profile("Hi",35,85));
		
		student.add(new Comparator_Student_Profile("Rahul",25,75));
		
		student.add(new Comparator_Student_Profile("Raj",34,89));
		
		student.add(new Comparator_Student_Profile("Priya",18,95));
		
		Comparator<Comparator_Student_Profile> com=new Comparator<Comparator_Student_Profile>()
		{

			@Override
			public int compare(Comparator_Student_Profile o1, Comparator_Student_Profile o2) {
				
				if(o1.marks < o2.marks)
					return 1;
				else if(o1.marks > o2.marks)
					return -1;
				else
					return 0;
			}
	
		};
		
		Collections.sort(student,com);
		
		for(Comparator_Student_Profile csf : student)
		{
			System.out.println(csf);
		}
		
	}

}
