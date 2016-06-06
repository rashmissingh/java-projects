import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user 
		System.out.println("Input a float: ");
		
		// Read the input
		float value = input.nextFloat();
		
		// Print the user input
		System.out.println("You entered the number: " + value);
	}

}
