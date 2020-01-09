import java.util.Scanner;

public class JumpSearch{

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
		 long startTime = System.nanoTime();
		jumpSearch(arr, value); 
		 long endTime = System.nanoTime();
        long runTime = endTime - startTime;
        
        System.out.println("Run Time of Jump searching of element is: " + runTime); 
	}

	public static int jumpSearch(int[] arr, int value) 
    { 
        int n = arr.length; 
        
        int step = (int)Math.floor(Math.sqrt(n));

		 int prev = 0; 
        while (arr[Math.min(step, n)-1] < value) 
        { 
            prev = step; 
            step += (int)Math.floor(Math.sqrt(n)); 
            if (prev >= n) 
                return -1; 
        } 

        while (arr[prev] < value) 
        { 
            prev++; 
            if (prev == Math.min(step, n)) 
                return -1; 
        } 

        if (arr[prev] == value) 
            return prev; 

       
  
        return -1; 

           

    }

	
}