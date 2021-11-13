package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
	
	
	public static void main(String[] args) {
		
		List<String> myList= new ArrayList<>();
		
		myList.add("Dhoni");
		myList.add("Virat");
		myList.add("Sachin");
		myList.add("Rahul");
		myList.add("Sourav");
		
		System.out.println("Print all the names :");
		
		for (int i = 0; i<myList.size(); i++) {
			
			System.out.println("Name of the Player is " + myList.get(i));
			
		}
		
		System.out.println("Third name is " + myList.get(2));
		System.out.println("Sachin exist in the list ? " + myList.contains("Sachin"));

		System.out.println("Number of names present in the Array List is " + myList.size());
		
		myList.remove(2);
		System.out.println("Now the number of names present in the Array List is " + myList.size());
		
		
	}

}
