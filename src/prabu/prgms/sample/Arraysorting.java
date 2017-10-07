package prabu.prgms.sample;

public class Arraysorting {

	 public static void sortingarray1()
	 {
		 int[] a = new int[]{15,10,2,7,8,21};
		 int[] b = new int[a.length];
		// int temp;
		 for(int i=0;i<a.length;i++){
			 boolean iscompare = false;
			 for(int j=i+1; j<=a.length;j++){
				 if(a[i]<a[j])
				 {
					iscompare = true;
					break;
				 }
				 if(iscompare)
				 {
					 b[i]=a[i];
				 }
			 }
		 }
		 for(int x=0;x<a.length;x++)
		 {
			 System.out.println(b[x]);
		 }
	 }
	 
	 public static void ascorder()
	 {
		 int[] a1 = new int[]{4,8,9,2,1,0,3};
		 int temp1 = 0;
		  for(int i=0; i<a1.length;i++)
		  {
			 for(int j= i; j<a1.length;j++)
			 {
				 if(a1[i]>a1[j])
				 {
					 temp1 = a1[j];
					 a1[j]=a1[i];
					 a1[i]=temp1;
					 				 
				 }
					 
			 }
		 }
		 for(int x=0; x<a1.length;x++)
		 {
			 System.out.println(a1[x]);
		 }
	 }
	 
	 public static void descorder()
	 {
		 int[] a2 = new int[]{4,8,9,2,1,0,3};
		 int temp2 = 0;
		  for(int i=0; i<a2.length;i++)
		  {
			 for(int j= i; j<a2.length;j++)
			 {
				 if(a2[i]>a2[j])
				 {
					 temp2 = a2[j];
					 a2[j]=a2[i];
					 a2[i]=temp2;
					 				 
				 }
					 
			 }
		 }
		 for(int x=0; x<a2.length;x++)
		 {
			 System.out.println(a2[x]);
		 }
	 }
	public static void main(String[] args) {
		//sortingarray1();
		ascorder();
		descorder();

	}
	
	
}
