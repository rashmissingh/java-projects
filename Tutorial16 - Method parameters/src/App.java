class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}
	public void move(String dir, int dist) {
		System.out.println("Moving " + dist + " meters in direction " + dir);
	}
}
public class App {
	public static void main(String[] args) {
		
		Robot sam = new Robot();

		sam.speak("Hi, I'm Sam!");	
		sam.jump(7);
		sam.move("West", 5);
		
		String greeting = "Hey, there!";
		sam.speak(greeting);
			
	}
}
