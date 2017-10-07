package prabu.prgms.sample;

public class Arrmerge {
	
	    public static void Arrmerge() {
	        int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
	        int[] arr2 = new int[] { 4, 5, 6, 7, 8 };
	        int[] arr3 = new int[arr1.length + arr2.length];
	        for (int i = 0; i < arr1.length; i++) {
	            arr3[i] = arr1[i];
	        }
	        int count = arr1.length;
	        for (int i = 0; i < arr2.length; i++) {
	            boolean isNeedToAdd = true;
	            for (int j = 0; j < arr1.length; j++) {
	                if (arr2[i] == arr1[j]) {
	                    isNeedToAdd = false;
	                    break;
	                }
	            }
	            if (isNeedToAdd) {
	                arr3[count] = arr2[i];
	                count = count + 1;
	            }
	        }
	        for (int i = 0; i < arr3.length; i++) {
	            System.out.println(arr3[i]);
	        }
	    }
	 

		    public static void main(String[] args) {
		    	Arrmerge();
		    }
	}


