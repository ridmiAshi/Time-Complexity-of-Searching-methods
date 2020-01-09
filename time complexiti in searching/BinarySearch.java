import java.util.Scanner;

public class BinarySearch{

	public static void main(String[]args){
		int [] arr = new int[10000];
		int n = arr.length;
		int value,i;	

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
		 long startTime = System.nanoTime();
		 //Binary searching

		 int f=0,l=n-1;
		 int mid = (f+l)/2;
		 while(f <= l){
		 	
		 	if(arr[mid] < value){
		 		f = mid + 1 ;
		 	}
		 	else if (arr[mid] == value){
		 		System.out.println("Element is found at index: " + mid);  
        		break; 
		 	}
		 	else{
		 		l = mid - 1;
		 	}
		 	mid = (f+l)/2;
		 }
		 if(f>l){
		 	System.out.println(value + " doesn't exist in array.");
		 }
		 	

         long endTime = System.nanoTime();
         long runTime = endTime - startTime;
         System.out.println("Run Time of Binary searching of element is: " +runTime);     

      		
	}

	
}