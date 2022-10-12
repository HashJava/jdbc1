package connect.jdbc;

public class comparison {

	private static int Switch;

	public static void main(String[] args) {

//
//	int carprice = 400;
//	String model = "hybird";
//	
//	
//	if (carprice == 400 & model == "hybrid") { 
//		
//		System.out.println("This is what I am looking for ");
//	}  else if (carprice <= 400 ) {
//		System.out.println("TRUE PRICE");
//	}
//		
//		

		int countdays = 1;
		String Weekdays;

		switch (countdays) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("Tudyes");
			break;
		case 4:
			System.out.println("fruday");
			break;
		default:
			System.out.println("pnot a in a range");

		}
		
		//Printing the largest and the smallest number of an array
		
		//delcare and array, then create an int variable largest store the array into that then create and enhanced for
		//loop declare and variable num to do the counter for you and your array name then create an if statement either larger or smaller then 
		// and finaly store largest into num 
		
		int[] arr = { 23, 343, 343, 34, 34, 3, 43, 34, 343 };
		int largest = arr[0];
		
		String [] list = {"cat","fish", "dog","horse"};
		
		for (int a = 0; a <= list.length; a++) {
			System.out.println("Printin here: " + list);
		}
		
		
		
		
		for (int num : arr) {
			if (largest < num) {
				largest = num;
			}
		}

		System.out.println("The largest number is:" + largest);
	}

}

