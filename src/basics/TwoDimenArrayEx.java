package basics;

public class TwoDimenArrayEx {
	
	public static void main(String args[])
	{
		int marks[][]= new int[3][3];
		
		// first row and first column
		marks[0][0]=97;
		marks[0][1]=98;
		marks[0][1]=99;
		
		//second row and second column
		marks[1][0]=87;
		marks[1][1]=88;
		marks[1][2]=89;
		
		//third row and third column
		marks[2][0]=77;
		marks[2][1]=78;
		marks[2][2]=79;
		
		for(int i=0;i<marks.length;i++)//i=row=first number
		{
			for(int j=0;j<marks.length;j++)//j=column=second number,after completing the inner loop it again start the i loop
			{
				System.out.println(marks[i][j]);
			}
		}
		
		
		
		//second way of creating two dimensional array
		int marks1[][]= 
			{
			        {78,79,80},
			        {81,82,83},
			        {84,85,86},
			};
				
				
		}
	}


