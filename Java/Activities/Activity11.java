package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Red");
		hm.put(2, "Blue");
		hm.put(3, "Green");
		hm.put(4, "Yellow");
		hm.put(5, "White");

		System.out.println("Currently the map contains : "+hm);
		
		hm.remove(2);
		
		System.out.println("After removing one color, now the map contains :"+hm);
		
		if(hm.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }
		
		System.out.println("Size of the map is : "+hm.size());
		
	}

}
