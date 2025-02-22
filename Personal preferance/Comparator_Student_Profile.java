
public class Comparator_Student_Profile {
	
	int roll,marks;
	String name;
	
	public Comparator_Student_Profile(String name,int roll, int marks) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Comparator_Student_Profile [roll=" + roll + ", marks=" + marks + ", name=" + name + "]";
	}
	
	
	

}
