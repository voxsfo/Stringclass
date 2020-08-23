package stringclasses;


class maxarray 
{ 
     static int arr[] = {20,45,233,123,23,1222,987}; 
       
     static int largest() 
     { 
         int i; 
            
         int max = arr[0]; 
         for (i = 1; i < arr.length; i++) 
             if (arr[i] > max) 
                 max = arr[i]; 
        
         return max; 
     } 
       
     public static void main(String[] args)  
     { 
         System.out.println("Largest in given array is " + largest()); 
        } 
 } 
