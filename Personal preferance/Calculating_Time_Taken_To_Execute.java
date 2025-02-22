import java.util.ArrayList;
public class Calculating_Time_Taken_To_Execute {
	
	public static void main(String args[])
	{
		
		long start,end;
		ArrayList<Integer> list=new ArrayList<>();
		start=System.currentTimeMillis();
		System.out.println(start);
		for(int i=1;i<=1000000;i++)
		{
			list.add(i);
		}
		end=System.currentTimeMillis();
		System.out.println(end-start);
		
	}

}
