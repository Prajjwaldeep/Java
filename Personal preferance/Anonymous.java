
public class Anonymous {
	
	public static void main(String[] args) {
		
		//Anonymous Class
//		Anupam obj=new Anupam()
//		{
//			
//			public void show()
//			{
//				System.out.println("Welcome");
//			}
//			
//		};
		
		//Using Lambda Expression
		Anupam obj=()->
		{
			System.out.println("Hello World");
		};
		
		obj.show();
		
	}
}
interface Anupam
{
	void show();
}