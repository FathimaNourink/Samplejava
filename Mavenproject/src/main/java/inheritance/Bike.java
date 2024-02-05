package inheritance;

public class Bike extends Vehicle{
int distance =5;
public void distancerun()
{
	System.out.println("Distance is ");
}
public static void main(String[] args) {
    Bike b = new Bike();
    
    // Accessing methods from the base class (Vehicle)
    b.run(); // Output: Vehicle is running.

    // Accessing methods and fields from the derived class (Bike)
    b.distancerun(); // Output: Distance is 5
    System.out.println(b.speed); // Output: 50
    System.out.println(b.distance); // Output: 5
}
}


