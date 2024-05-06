package SetofPrograms;

class Vehicle {
	void drive() {
		System.out.println("drive() method base class");
		System.out.println("Driving the car");
		
	}
}
	class Car extends Vehicle{
		void drive() {
			System.out.println("drive() method from derived class");
			System.out.println("Car is driving");
		}
	}


public class GUF {

	public static void main(String[] args) {
		Car c1=new Car();
		Vehicle v1=new Vehicle();
		c1.drive();
		v1.drive();
		//drive() method of Vehicle class is overridden by Car class drive()
        Vehicle v=new Car();
		v.drive();

	}

}
