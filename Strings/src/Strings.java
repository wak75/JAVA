import java.util.Scanner;
public class Strings {

	public static void main(String[] args)
	{
		String greetings  = "Hello %s , %s, how are you?";
		System.out.println("Enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		String morning = "good morning";
		String evening = "good evening";
		
		String final_greetings =String.format(greetings,name, morning);
		System.out.println(final_greetings);
		
		System.out.printf("Hello %s , how are you? ", "angela");
	}
	
}
