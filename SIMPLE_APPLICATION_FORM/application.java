import java.util.Scanner;
class application
{
	Scanner sc = new Scanner(System.in);

	String username;
	String password;

	application(String user, String pass)
	{
		this.username= user;
		this.password=pass;
	}

	void successful()
	{
		System.out.println("Login successful!!! Welcome master");
	}

	void passincorrect()
	{
		System.out.println("")
	}


}