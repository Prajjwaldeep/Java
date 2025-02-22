import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Duplicate_Using_ArrayList {

	public static void main(String args[]) {

		ArrayList<String> names = new ArrayList<>();

		names.add("Rahul");
		names.add("Raj");
		names.add("Shreya");
		names.add("Virat");
		names.add("Rahul");
		names.add("Raj");
		names.add("Rahul");
		names.add("Raj");
		names.add("Rahul");
		names.add("Raj");

		Set<String> set = new HashSet<>();

		
		for(String name : names)
		{
			//true means printing all the values WITHOUT DUPLICATES ones
			//false means printing ONLY the DUPLICATE ones
			if(set.add(name)==true)
			{
				System.out.println(name);
			}
		}
		 

		/*
		 * String arr[] = new String[names.size()]; int i = 0, j, flag = 0; for (String
		 * name : names) { arr[i] = name; i++; } for (i = 0; i < arr.length; i++) { flag
		 * = 0; for (j = i + 1; j < arr.length; j++) { if (arr[i].equals(arr[j]) &&
		 * !arr[i].equals("") & !arr[j].equals("")) { // flag=1; flag++; arr[j] = ""; }
		 * } if (flag == 0) { System.out.println(arr[i]); } }
		 */

	}

}
