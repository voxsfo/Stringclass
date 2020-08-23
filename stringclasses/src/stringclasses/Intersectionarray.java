package stringclasses;

public class Intersectionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int myArray1[] = {10,12,19,99,81};
	      int myArray2[] = {85, 43, 19, 14, 12};
	      System.out.println("Intersection of the two arrays ::");
	     
	      for(int i = 0; i<myArray1.length; i++ ) {
	         for(int j = 0; j<myArray2.length; j++) {
	            if(myArray1[i]==myArray2[j]) {
	               System.out.println(myArray2[j]);
	            }
	         }
	      }
	   }
	}