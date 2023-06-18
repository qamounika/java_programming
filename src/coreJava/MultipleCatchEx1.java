package coreJava;

public class MultipleCatchEx1 {

	public static void main(String[] args) {
		try
		{
			String s=null;
			System.out.println(s.charAt(3));
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		
		catch(Exception ex)
		{
			System.out.println(ex);

	}

}
}
