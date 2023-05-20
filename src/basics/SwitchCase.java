package basics;

public class SwitchCase {

	public static void main(String args[])
	{
		int m=8;
		String month ="";
		
		switch(m)
		{
		  case 1:
			  month ="jan";
			  break;
		  case 2:
			  month ="feb";
			  break;
		  case 3:
			  month ="mar";
			  break;
		  case 4:
			  month ="april";
			  break;
		  case 5:
			  month ="may";
			  break;
		  case 6:
		      month ="june";
		      break;
		  case 7:
			  month ="july";
			  break;
		  case 8:
			  month ="august";
			  break;
		  case 9:
			  month ="sep";
			  break;
		  case 10:
			  month ="oct";
			  break;
		  case 11:
			  month ="nov";
			  break;
		  case 12:
			  month ="dec";
			  break;
		  default:
			  month="not a valid month";
			  break;
		}
		  System.out.println(month);	  
		}
		
	}

