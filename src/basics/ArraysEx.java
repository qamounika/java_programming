package basics;

public class ArraysEx {
	
	public static void main(String args[])
	{
		//first way of creating arrays
		int marks1[]=new int[5];
		marks1[0]=95;
		marks1[1]=85;
		marks1[2]=75;
		marks1[3]=65;
		marks1[4]=55;
		System.out.println(marks1[4]);
		//second way of creating array
		int marks2[]= {45,55,65,75};
		//third way of creating array
		int[]marks3= {75,85,95};
		System.out.println(marks1.length);
		int i;
		for(i=0;i<marks1.length;i++)
		{
			System.out.println(marks1[i]);
			
		}
		
	}

}
