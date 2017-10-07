package prabu.prgms.sample;

public class Student1 {
		 int rollno;  
		 String name;  
		 String city;  
		  
		public Student1(int i, String name, String city) {
			 this.rollno=rollno;  
			 this.name=name;  
			 this.city=city; 
		}
		
		public String toString()
		{
			return rollno+""+name+""+city;
		}

		 public static void main(String args[]){  
		   Student1 s1=new Student1(101, "Raj", "Salem");  
		   Student1 s2=new Student1(102, "Sachin", "Salem");  
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  
		 }  
		 
}
