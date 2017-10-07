package prabu.prgms.sample;

public class Switch {

	public static void Switch()
	{
		int star = 3;
		String rating;	
		
		switch(star){
		 case 1:  rating = "Not eligible";
         break;
		 case 2 : rating = "not meeting expectation";
		 break;
		 case 3 : rating = "meeting expectations";
		 break;
		 case 4 : rating = "exceeding expectations";
		 break;
		 case 5 : rating = "outstanding";
		 break;
		 default : rating = "invalid rating";
		 break;
		 		
		}
		
		System.out.println("The rating desc is: "+rating);
	}
	
	public static void main(String args[])
	{
		Switch();
	}
}
