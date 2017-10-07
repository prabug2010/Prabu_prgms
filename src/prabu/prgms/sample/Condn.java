package prabu.prgms.sample;

import java.util.Scanner;

public class Condn {
	
	public static Scanner scan2;
	
			public static void main(String[] args) {
			switchCondition();
		}

		
		public static void switchCondition() {
		     String dayborn;
		     System.out.println("Enter the day you born :");
				scan2 = new Scanner(System.in);
				int dayno = scan2.nextInt();
		     
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
