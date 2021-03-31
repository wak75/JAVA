class number
{
	int num;

	boolean flag = false;

	number(int n)
	{
		num =n;

		for(int i=2;i<num;i++)
		{
			if(num%i ==0)
			{
				flag=true;
			}
		}

		if(flag== false)
		{
			System.out.println(num);
		}
		/*else
		{
			System.out.println("The number is not prime");
		}*/

	}
}

class Main
{
	public static void main(String[] args) {

		for (int i=2;i<200;i++)
		{
			//System.out.print("The number is "+ i+ " and ");
			number n = new number(i);
		}
		
	}
}