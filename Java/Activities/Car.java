package activities;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car() {
		
		this.tyres = 4;
		this.doors = 4;
		
	}
	public void displayCharacteristics() {
		System.out.println("Color of the car" +color );
		System.out.println("Transmission of the car" +transmission );
		System.out.println("Make of the car" +make );
		System.out.println("Number of tyres on the car" +tyres );
		System.out.println("Doors on the car" +doors );
	}
	
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	
	public void brake() {
		System.out.println("Car has stopped.");
	}
	
}
