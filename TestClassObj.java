class ToBeLoaded
{
	static
	{
		System.out.print("\n\t\tLoaded");
	}
}
public class TestClassObj
{
	public static void main(String[] args) 
	{
		Class c=null;
		
			c=ToBeLoaded.class;
			System.out.print(c.getName()+"\t"+c.isInterface());
		// try{
			// c=Class.forName("ToBeLoaded");
			
		// }catch(Exception e)
		// {
			// System.out.print("ex");
		// }
		
	}
}