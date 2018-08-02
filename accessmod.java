package packa;
import packb.Student5;
public class Student
{
	protected int a,b;
	 void a1()
	{
	System.out.println("Value ofa is"+a);
	}
	void b1()
	{
	System.out.println("Value of b is"+b);
	}
}
class Check
{
	public static void main(String[] a)
	{
		Student5 s1=new Student5();
		//New s=new New();
		s1.p=10000;
		s1.q=20000;
		s1.a1();
		s1.b1();
		s1.a=10;
		s1.b=20;
		s1.a1();
		s1.b1();
	}
}