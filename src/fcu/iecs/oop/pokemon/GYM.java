package fcu.iecs.oop.pokemon;

public class GYM {
	public static void fight(Pokemon p1 , Pokemon p2)
	{
		if(Math.random()*10 < 5)
		{
			System.out.println("Winner is " + p1.getName());
			int a=p1.getCp()+500;
			p1.setCp(a);
			System.out.println("cp is " + p1.getCp());
		}
		else
		{
			System.out.println("Winner is " + p2.getName());
			int b=p2.getCp()+500;
			p2.setCp(b);
			System.out.println("cp is " + p2.getCp());
		}
	}

}
