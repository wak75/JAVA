import java.util.Scanner;

class formating
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String first = sc.nextLine();

		System.out.println(first);

		String second="Hello %s! , welcome to your journey";
		// System.out.println(second,first);


		String naya_wala = String.format(second,first);
		System.out.println(naya_wala); 
	}
}