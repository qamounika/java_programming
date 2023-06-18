package oops;
interface RBI
{
void rateOfInterest();
}
class SBI implements RBI
{
	public void rateOfInterest()
	{
		System.out.println("rate of interst is 9");
	}
}
class AXIS implements RBI
{
	public void rateOfInterest()
	{
		System.out.println("rate of interest is 10");
	}
}
class IDFC implements RBI
{
	public void rateOfInterest()
	{
		System.out.println("rate of interest is 11");
	}
}

public class InterfaceEx2 {
	public static void main(String args[])
	{
		SBI sbi=new SBI();
		sbi.rateOfInterest();
		AXIS axis=new AXIS();
		axis.rateOfInterest();
		IDFC idfc =new IDFC();
		idfc.rateOfInterest();
	}	

}
