package basics;

public class StringBuildersEx {

	public static void main(String args[])
	{
		//first method of creating string builder
		StringBuilder sb= new StringBuilder();
		sb.append("Hello");
		sb.append("world");
		System.out.println(sb);
		
		
		// second method of creating string builder
		StringBuilder sb1 =new StringBuilder("Hello");
		sb1.append("world");
		System.out.println("Second method of creating string"+sb1);
		//Third method of creating string builder
		
		StringBuilder sb2=new StringBuilder(10);
		sb2.append("java");
		sb2.append("programming");
		System.out.println("third way of creating string builder" + sb2);
		// other methods for string builder
		
		sb.insert(1, "java");
		System.out.println("after inserting" +sb);
		
		//delete-beginindex is inclusive end index is exclusive
		sb.delete(1, 5);
		System.out.println("after deleting" +sb);
		
		sb.replace(5,10,"java");
	    System.out.println("after replacing " +sb);
	    
	   String sub= sb.substring(0,5);
	    System.out.println("after extracting" +sub);
	    // we can call from output
	    System.out.println(sb.substring(0,5));
	    
	    String sub1=sb.substring(5);
	    System.out.println("after extracting"+ sub1);
	    
	    sb.reverse();
	    System.out.println("after reversing" +sb);
	    
	   char ch= sb.charAt(3);
	   System.out.println(ch);
	   System.out.println("lenght of string-->"+sb.length());
	   
	   StringBuilder sb4= new StringBuilder();
	   System.out.println("DefaultCapacity-->"+sb4.capacity());
	   sb4.append("Hello");
	   System.out.println("after appending hello-->"+sb4.capacity());
	   sb4.append("java is my favorite language");
	   System.out.println("after appending-->"+sb4.capacity());
	   
	   //ensure capacity
	   StringBuilder sb5=new StringBuilder();
	   System.out.println("DefaultCapacity sb5-->"+sb5.capacity());//16
	   sb4.append("Hello");
	   System.out.println("after appending hello-->"+sb5.capacity());//16
	   sb5.append("java is my favorite language");
	   System.out.println("after appending-->"+sb5.capacity());
	   
	   sb5.ensureCapacity(15);
	   System.out.println("checking the capacity when the minimumcapacity (15) < current capacity (34)-->"+sb5.capacity());
	   
	   sb5.ensureCapacity(50);
	   System.out.println("Checking the capacity when the minimum capacity(50) > current capacity(34)-->"+sb5.capacity());
	   
	   
	   
	   
	  //string builder capacity formula
	   //default capacity is 16 characters
	   //new capacity=(old capacity*(2)+2)
	   
	    

	}
}
