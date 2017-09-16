import java.util.*;
class PriQueue
{
	public static void main(String args[])
	{
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		//p.addAll(p,"8,2,6,5,7,4".split(" "));
		p.add(8);
		p.add(2);
		p.add(6);
		p.add(5);
		p.add(7);
		p.add(4);
		Iterator<Integer> i=p.iterator();
		// while(!p.isEmpty())
		// {
			// //int temp=i.next();
			// System.out.println(p.remove());
		// }
		
		// while(i.hasNext())
		// {
			// int temp=i.next();
			// System.out.println(temp);
		// }
		System.out.println(p.toString());
		
	}
}