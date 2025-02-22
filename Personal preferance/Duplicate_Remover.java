import java.util.*;

public class Duplicate_Remover {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(9,2,6,4,8,9,5,2,1,4,5,6,2,3,6,9,7);
		ArrayList<Integer> newList=new ArrayList<>();
		
		for(int i : list)
		{
			if(!newList.contains(i))
			{
				newList.add(i);
			}
		}
		
		Collections.sort(newList);
		
		System.out.println("New List after removing duplicate elements:");
		newList.forEach(System.out::println);
	}

}
