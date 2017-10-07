package prabu.prgms.sample;

public class Conditions {

	public static int a = 0;

	public static int b = 9;

	public static int c = 8;

	public static int d = 8;

	public static int e = 8;

	public static int f = 8;

	public static void main(String[] args) {
		//ifCondition();
		ifElseIfCondition();
		switchCondition();
	}

	public static void ifCondition() {
		if (a > b) {
			System.out.println("a is bigger than b");
		} else {
			System.out.println("b is bigger than a");
		}
	}

	public static void ifElseIfCondition() {
		if (a > b) {
			System.out.println("a is bigger than b");
		} else if (c > b) {
			System.out.println("c is bigger than b");
		} else if (d > b) {
			System.out.println("d is bigger than b");
		} else {
			System.out.println("b is bigger");
		}
	}

	public static void switchCondition() {
	     String monthString;
	     int month = 6;
	        switch (month) {
	            case 1:  monthString = "January";
	                     break;
	            case 2:  monthString = "February";
	                     break;
	            case 3:  monthString = "March";
	                     break;
	            case 4:  monthString = "April";
	                     break;
	            case 5:  monthString = "May";
	                     break;
	            case 6:  monthString = "June";
	                     break;
	            case 7:  monthString = "July";
	                     break;
	            case 8:  monthString = "August";
	                     break;
	            case 9:  monthString = "September";
	                     break;
	            case 10: monthString = "October";
	                     break;
	            case 11: monthString = "November";
	                     break;
	            case 12: monthString = "December";
	                     break;
	            default: monthString = "Invalid month";
	                     break;
	        }
	        System.out.println(monthString);
	        
	        
	        String day;
		     String noOfDay = "4";
		        switch (noOfDay) {
		            case "1":  day = "Mon";
		                     break;
		            case "2":  day = "Tue";
		                     break;
		            case "3":  day = "Wed";
		                     break;
		            case "4":  day = "Thu";
		                     break;
		            case "5":  day = "Fri";
		                     break;
		            case "6":  day = "Sat";
		                     break;
		            case "7":  day = "Sun";
		                     break;
		            default: day = "Invalid day";
		                     break;
		        }
		        System.out.println(day);
	    }
	}
