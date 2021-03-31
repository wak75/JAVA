import java.util.Scanner;

class cal
{
	public static void main(String args[]) {
		Scanner user = new Scanner (System.in);

		Float fnum, snum , answer;

		System.out.print("Enter the first Number: ");
		fnum=user.nextFloat();

		System.out.print("Enter the second number: ");
		snum = user.nextFloat();

		answer=fnum+snum;

		System.out.print("The sum of the two numbers are: ");
		System.out.println(answer);
	}
}