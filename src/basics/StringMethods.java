package basics;

public class StringMethods {
	
	public static void main(String args[])
	{
		String str="java";
		str=str.concat("is a programming language");
		System.out.println(str);
		
		 String str1= str.toUpperCase();
		 System.out.println(str1);
		 
		 String str2= str.toLowerCase();
		 System.out.println(str2);
		 
		 char str3= str.charAt(4);
		 System.out.println(str3);
		 
		 String str4= str.replace("a","e");
		 System.out.println(str4);
		 
		 boolean str5= str.contains("is");
		 System.out.println(str5);
		 
		 String str6 =" ";
		 boolean EmptyString= str6.isEmpty();
		 System.out.println(EmptyString);
		 
		 String str7="hello";
		 String str8="Hello";
		 boolean equalString= str7.equals(str8);
		 System.out.println(equalString);
		 
		 boolean equalIgnoresString= str7.equalsIgnoreCase(str8);
		 System.out.println(equalIgnoresString);
		 
		 String str9= str.substring(2, 10);
		 System.out.println("Substring-->"+str9);
		 
		 String str10= str.substring(2);
		 System.out.println("Substring without end index-->"+str10);
			
		 int lengthOfString= str7.length();
		 System.out.println(lengthOfString);
			
		 int ch=str7.indexOf("o");
		 System.out.println("Index of -->"+ch);
		 
		 String[]str11=str.split(str);
		 System.out.println(str11);
		 
		 
		 

			
			
			
		 
		 
		 
	}

}
