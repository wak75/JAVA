class comparision
{
	public static void main(String[] args)
	{
		System.out.println("=========String comparision===============" );

		String s = " hello ";
		String s2 = " hello ";

		String s3 = new String(" hello ");
		System.out.println(s==s2);

		System.out.println(s==s3);
		System.out.println("using is equal operator:"+ s.equals(s2));
		System.out.println("Using is equal operator:"+ s.equals(s3));

		System.out.println("inter function " + s==s3.intern());


		String name1 ="Washim";
		String name2 = "washim";

		System.out.println("comparision of name1 and name2 without ignoring case " + name1.equals(name2));
		System.out.println("comparision of name1 and name2 with ignoring case " + name1.equalsIgnoreCase(name2));	
	}
}