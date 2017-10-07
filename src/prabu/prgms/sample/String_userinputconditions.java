package prabu.prgms.sample;

import java.util.Scanner;

public class String_userinputconditions {
	
	public static Scanner scan;
		
	public static void main(String args[]) {
		stringinput();
		//stringcase();
		//stringinputcase();
	}

	
	public static void stringinput() {
		
		System.out.println("Enter the first string :");
		 scan = new Scanner(System.in);
		 String a = scan.next();
		 
		 System.out.println("Enter the second string :");
		 scan = new Scanner(System.in);
		 String b = scan.next();
		 
		 int x = a.length();
			int y = b.length();
			
			if (x>y){
				
				System.out.println("First input is the lengthest one");
			}
			else if (x==y)
			{
				System.out.println("Both are equal in length");
			}
			else {
				System.out.println("Second input is the lengthest one");
			}
			}
	
	public static void stringcase()
	{
		String dayyouborn ;
		int dayno = 4;
		switch (dayno) {
		case 1: dayyouborn = "Monday";
				break ;
		case 2: dayyouborn = "Tuesday";
				break;
		case 3: dayyouborn = "Wednesday";
				break ;
		case 4: dayyouborn = "Thursday";
				break;
		case 5: dayyouborn = "Friday";
				break ;
		case 6: dayyouborn = "Saturday";
				break;
		case 7: dayyouborn = "Sunday";
				break ;
		default : dayyouborn = "Invalid day";
		break;
		}		
		System.out.println(dayyouborn);
	}
	
	
		public static void stringinputcase()
		{
			String dayborn ;
			System.out.println("Enter the day you born :");
			scan = new Scanner(System.in);
			int dayno = scan.nextInt();
			switch (dayno) {
			case 1: dayborn = "Monday";
					break ;
			case 2: dayborn = "Tuesday";
					break;
			case 3: dayborn = "Wednesday";
					break ;
			case 4: dayborn = "Thursday";
					break;
			case 5: dayborn = "Friday";
					break ;
			case 6: dayborn = "Saturday";
					break;
			case 7: dayborn = "Sunday";
					break ;
			default : dayborn = "Invalid day";
			break;
			}
			
			System.out.println(dayborn);
		
		
	}
	}
	
	 
	 
	


