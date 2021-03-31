package method_overloading;

import java.util.Scanner;
public class area {
	
	int areap(int a)
	{
		return a*a;
	}
	
	int areap(int b, int c)
	{
		return b*c;
	}

}

class find_area
{
	public static void main(String[] args)
	{
		area ar = new area();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice: \n 1. area of square \n 2. area of rectangle");
		int user =sc.nextInt();
		
		if (user == 1)
		{
			System.out.println("\n***Enter only the value of side for the Square***\n");
			int sq= sc.nextInt();
			
			int sq_area = ar.areap(sq);
			System.out.println("Area of the square is: "+ sq_area);
		}
		else
		{
			System.out.println("\n\n ***Enter both length and breadth for rectangle ***\n");
			int re1, re2;
			
			System.out.println("Enter the length of rectangle" );
			re1 = sc.nextInt();
			
			System.out.println("Enter the bredth of rectangle" );
			re2 = sc.nextInt();
			
			int area_rect = ar.areap(re1, re2);
			
			System.out.println("The area of the rectangls is: "+ area_rect);
			
		}
		
		
		
		
	}
}
