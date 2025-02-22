
public interface Actor_Hero_Villain {
	
	void act();
	void speak();
	default void comedy()
	{
		//Body
	}
	default void rude()
	{
		//Body
	};
}
class Hero implements Actor_Hero_Villain
{
	public void act()
	{
		System.out.println("Hey! I can act");
	}
	
	public void speak()
	{
		System.out.println("Hey! I can speak");
	}
	
	public void comedy()
	{
		System.out.println("Hey! I can make ppl laugh");
	}
	
}
class Villain implements Actor_Hero_Villain
{
	public void act()
	{
		System.out.println("Hey! I can act");
	}
	
	public void speak()
	{
		System.out.println("Hey! I can speak");
	}
	
	public void rude()
	{
		System.out.println("Rude");
	};
}