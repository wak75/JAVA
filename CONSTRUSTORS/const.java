import java.util.Scanner;

class constr
{
	int num;
	String statement;

	constr()
	{
		num = 10;
		statement = "hello I am king";

		System.out.println("This is the first constructor and the num is " + num + "and the statement is "+ statement);
	}

	constr(int x, String stuff)
	{
		this();
		this.num = x;
		this.statement = stuff;
		System.out.println("This is the second const and the value of the x in " + x+ " as well as the num " + num + "statement " + statement);

	}

	constr(constr ob)
	{
		num = ob.num;
		statement = ob.statement;
		System.out.println("This is just a copy const which copy data");
		System.out.println("The copied data is num = "+num + " and statement is "+statement);
	}
}

class calling
{
	
	public static void main(String[] args) {
		constr ct = new constr();
		constr ct1 = new constr(25, "hello I am devil");
		constr ct3 = new constr(ct);

	}
	
}