import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Print you command: ");
		String cmd = input.nextLine();

		switch (cmd) {
		case "start":
			System.out.println("Machine started.");
			break;
		case "stop":
			System.out.println("Machine stopped.");
			break;
		default:
			System.out.println("Bad command.");
		}
	}

}
