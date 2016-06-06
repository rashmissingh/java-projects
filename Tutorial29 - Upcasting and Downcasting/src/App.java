class Machine {
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera started");
	}
	
	public void snap() {
		System.out.println("Photo taken.");
	}
	
}
public class App {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		// Upcasting -
		// Variable type determines what methods can be called
		// machine2 is of Machine type, hence start() can be called, not snap()
		// Object type determines which implementation gets called
		// Object camera1 is of type Camera, so Camera's implementatin of start() gets called
		Machine machine2 = camera1;
		machine2.start();
		// error: machine2.snap();
		
		// Downcasting
		Machine machine3 = new Camera();
		Camera camera2 = (Camera)machine3;
		camera2.start();
		camera2.snap();
		
		// Won't work - you need to be very clear on the type of object being referred
		// References are up/down cast
		// You don't cast an object
		Machine machine4 = new Machine();
		Camera camera3 = (Camera)machine4;
		// Runtime error
		// camera3.start();
		// camera3.snap();
		
	}

}
