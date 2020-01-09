import java.util.Scanner;

public class LinearSearch{

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
		 long startTime = System.nanoTime();
		 //linear searching
		 for (i = 0; i < n; i++) {
        	if (arr[i] == value)  {
          		 System.out.println(value+" is present at location "+(i));
           break;
         }}
         long endTime = System.nanoTime();
         long runTime = endTime - startTime;
         System.out.println("Run Time of linear searching of element is: " +runTime);     

      		if (i == n)
        		System.out.println(value + " doesn't exist in array.");
	}

	
}