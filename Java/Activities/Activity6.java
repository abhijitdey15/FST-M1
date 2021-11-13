package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		
		Plane plane = new Plane(10);
		
		plane.onboard("Dhoni");
        plane.onboard("Rahul");
        plane.onboard("Virat");
        plane.onboard("Rohit");
		
        System.out.println("Take off time is : "+plane.takeOff());
        System.out.println("Passengers on the plane : "+plane.getPassengers());
		
        Thread.sleep(5000);
        
        plane.land();
        
        System.out.println("Plane landed at : "+plane.getLastTimeLanded());
	}

}
