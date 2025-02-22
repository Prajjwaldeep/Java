import java.util.*;
public class Anagram {
	
	public static void main(String[] args) {
		
		String s1="anagramm";
		String s2="marganaa";
		
		Anagram anagram=new Anagram();
		int length=anagram.checkAnagramAndCount(s1,s2);
		
		if(s1.length() >= s2.length())
		{
			if(length==s1.length())
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("NOT Anagram");
			}
		}
		else
		{
			if(length==s2.length())
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("NOT Anagram");
			}
		}
		
		
	}
	
	public int checkAnagramAndCount(String s1,String s2)
	{
		
		int count=0;
		
		ArrayList<Character> list=new ArrayList<>();
		
		for(char ch : s1.toLowerCase().toCharArray())
		{
			if(!list.contains(ch))
			{
				System.out.println(ch);
				list.add(ch);
			}
		}
		System.out.println();
		
		for(char c : s2.toLowerCase().toCharArray())
		{
			
			if(list.contains(c) )
			{
				System.out.println(c);
				list.add(c);
				count++;
			}
			
		}
		
		//list.forEach(System.out::println);
		
		return count;
		
	}

}
