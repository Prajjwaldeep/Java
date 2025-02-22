import java.util.*;

public class Anagram_Using_Arrays_Sort {
	
	public static void main(String[] args) {
		
		String s1="SILENT";
		String s2="LISTEN";
		
//		char ch1[]=s1.toLowerCase().replaceAll("[\\s+]", "").toCharArray();
//		char ch2[]=s2.toLowerCase().replaceAll("[\\s+]", "").toCharArray();
//		
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		
//		if(Arrays.equals(ch1, ch2))
//		{
//			System.out.println("Anagram");
//		}
//		else
//		{
//			System.out.println("Not Anagram");
//		}
		
		Anagram_Using_Arrays_Sort anagram=new Anagram_Using_Arrays_Sort();
		
		anagram.Anagarm_With_Collections(s1, s2);
		
	}
	
	public void Anagarm_With_Collections(String s1,String s2)
	{
		
		ArrayList<Character> list1=new ArrayList<>();
		for(char ch : s1.toLowerCase().replaceAll("[\\s+]", "").toCharArray())
		{
			list1.add(ch);
		}
		
		
		
		ArrayList<Character> list2=new ArrayList<>();
		for(char ch : s2.toLowerCase().replaceAll("[\\s+]", "").toCharArray())
		{
			list2.add(ch);
		}
		
		Collections.sort(list1);
		Collections.sort(list2);
		
//		list1.forEach(System.out::print);
//		
//		System.out.println();
//		
//		list1.forEach(System.out::print);
		
		if(list1.equals(list2))
		{
			System.out.println("Anagrams");
		}
		else
		{
			System.out.println("Not Anagrams");
		}
		
	}

}
