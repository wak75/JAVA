class Sting
{
	public static void main(String[] args)
	{
		String s= " hello ";


		System.out.println("String length = "+s.length());
		System.out.println("Does string contains a letter: "+ s.contains("lo"));
		System.out.println("Is string is empty "+s.isEmpty());
		System.out.println("Change to uppercase: "+ s.toUpperCase());
		System.out.println("Is the string starts with: "+ s.startsWith("k"));
		System.out.println("Replace the value: "+s.replace("llo","LLO"));
		System.out.println("Trim " + s.trim());
		System.out.println("use strip "+ s.strip());
		System.out.println("Substring "+ s.substring(0,3));
		System.out.println("Array to string(s.getBytes): "+ s.Array.toString(s.getBytes()));
	}
}