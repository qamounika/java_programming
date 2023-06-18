package basics;

public class StringBufferEx {
	
	public static void main(String args[])
	{
		StringBuffer sbb= new StringBuffer();
		System.out.println("default capacity-->"+sbb.capacity());
		sbb.append("Hello");
		System.out.println("after appending-->"+sbb);
	}

}
