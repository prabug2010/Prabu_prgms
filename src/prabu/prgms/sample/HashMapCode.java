package prabu.prgms.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapCode {
	
	public static void hashcode()
	{
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  for(Map.Entry x:hash_map.entrySet()){  
		   System.out.println(x.getKey()+" "+x.getValue());  
		  }
		  
		  String s = hash_map.get(2);
		  System.out.println(s);
	}
	   public static void hashmap2()
	   {  
		  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		   System.out.println("The Original map: " + hash_map);
		   HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>(); 
		   new_hash_map = (HashMap)hash_map.clone();     
		   System.out.println("Cloned map: " + new_hash_map);        
		     }
	public static void hashmap3()
	{
		HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  // create set view for the map
		  Set set = hash_map.entrySet();
		  // check set values
		  System.out.println("Set values: " + set);
	}
	public static void main(String args[]) 
	{  
		hashcode();
		hashmap2();
		hashmap3();
		    
		 }  

}
