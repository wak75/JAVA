package method_overloading;

public class printing {

	int printn(int a)
	{
		return a;
		
	}
	
	double printn(double b)
	{
		return b;
	}
}

class printnumber
{
	public static void main(String[] args)
	{
	printing p = new printing();
	
	int x= p.printn(24);
	System.out.println("thee first number is " +x);
	
	double m = p.printn(44.5);
	System.out.println("thee second number is " +m);}
	
}
