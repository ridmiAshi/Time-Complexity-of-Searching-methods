import java.util.Scanner;

public class InterpolationSearch{

	public static void main(String[]args){

		int value,i;
		int [] arr = new int[10000];
		int n = arr.length;;

		//creating an array of 100 elements
		//int [] arr = new int[100];
		for (int a = 0; a < arr.length; a++) {
    		arr[a] = a + 1;
			}

		for (int a = 0; a < arr.length; a++) {
    		System.out.print(" " +arr[a]);
			}

		//User Input search value
		Scanner input = new Scanner(System.in);
		System.out.println("\n Enter the search value:");
      	value = input.nextInt();
		
		 //time complexity
		
      		if (x== -1){
        		System.out.println(value + " doesn't exist in array.");
      		}else{
      			 long startTime = System.nanoTime();
		 //interpolation searching
		int x =interpolationSearch(arr,value);


         long endTime = System.nanoTime();
         long runTime = endTime - startTime;
         System.out.println("Run Time of interpolation searching of element is: " +runTime);     

      		}
	}

	static int interpolationSearch(int [] arr,int value) 
    { 
         
        int lo = 0, hi = (arr.length - 1); 
       
        long startTime = System.nanoTime();
        
        while (lo <= hi && value >= arr[lo] && value <= arr[hi]) 
        {         
  
            if (lo == hi) 
            { 
                if (arr[lo] == value) return lo; 
                return -1; 
            } 
         
            
              
            int pos = lo + (((hi-lo) / 
                  (arr[hi]-arr[lo]))*(value - arr[lo]));
            if (arr[pos] == value) 
                return pos; 
       
           
            if (arr[pos] < value) 
                lo = pos + 1; 
       
            
            else
                hi = pos - 1; 
        } 
        return -1; 
    } 
    
    
	
}