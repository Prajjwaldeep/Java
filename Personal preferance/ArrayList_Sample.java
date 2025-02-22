import java.util.*;

public class ArrayList_Sample {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(list.size());
		
		for(int i:list)
		{
			System.out.println("Number "+i);
		}
		
	}
	
}
