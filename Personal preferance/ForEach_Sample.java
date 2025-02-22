import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach_Sample {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		
//		Consumer<Integer> con=new Consumer<>()
//		{
//			@Override
//			public void accept(Integer t) {	
//				System.out.println(t);
//			}
//		};
//		
//		list.forEach(con);
		
		
		
		
//		Consumer<Integer> con=(t)-> 
//			{	
//				System.out.println(t);
//			};
//		list.forEach(con);
		
		//Consumer<Integer> con=(t) -> System.out.println(t);
		
		//DIRECT IMPLEMENTATION
		list.forEach((t) -> System.out.println(t));
		
		
		
		list.forEach(i -> System.out.println(i));
		
	}

}
