public class CheckEven
{
	public static void main(String[] args)
	{
		System.out.println(CheckEven(9));		
	}
	public static Boolean CheckEven( int n)
	{
		if (n%2 == 0) return true;
		else return false;
	}
}