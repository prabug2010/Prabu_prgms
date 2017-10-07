package prabu.prgms.sample;

public class Descorderarray {

	 public static void Descorderarray()
	 {
		 int[] n = new int[] {4,8,5,1,3,9};
		 int temp=0;
		 for(int i=0; i<n.length; i++)
		 {
			 for(int j=i; j<n.length; j++)
			 {
				 if(n[i]<n[j])
				 {
					 temp = n[j];
					 n[j]=n[i];
					 n[i]=temp;
				 }
			 }
		 }
		 for(int k=0; k<n.length;k++)
		 {
			 System.out.println(n[k]);
		 }
		 
	 }
	 
	 public static void main(String args[])
	 {
		 Descorderarray();
	 }
}
