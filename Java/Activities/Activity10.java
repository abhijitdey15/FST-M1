package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		
		Set<String> hs= new HashSet<>();
		
		hs.add("Dhoni");
		hs.add("Virat");
		hs.add("Sachin");
		hs.add("Rahul");
		hs.add("Sourav");
		hs.add("Rohit");
		
		System.out.println("Size of the HashSet is " + hs.size());
		
		hs.remove("Sachin");
		System.out.println("Now the size of the HashSet is " + hs.size());
		
		hs.remove("Suresh");
		System.out.println("Sachin exist in the set ? " + hs.contains("Sachin"));
			

	}

}
