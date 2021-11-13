package activities;

public class Activity2 {

	public static void main(String[] args) {
		
		// initializing array
		
		int [] example = {10,77,10,54,-11,10};
		int sum = 0;
		
		for (int i = 0;i<example.length;i++) {
			
			if (example[i] == 10) {
				sum= sum+10;
			}
		}
		
		System.out.println("Result is : "+sum);
		
		//Validation
		
		if (sum == 30) {
			System.out.println("Yes, value is equal to 30");
		} else {
			System.out.println("Value is not equal to 30");
		}

	}
}