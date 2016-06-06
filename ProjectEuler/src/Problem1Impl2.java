import java.util.Scanner;

public class Problem1Impl2 {

	public static void main(String[] args) {
		int remainder1 = 0, remainder2 = 0;
		int partSum1 = 0;
		
		int number1 = 0, number2 = 0;
		int upperLimit = 0;
		
		System.out.println("Problem: Multiples of 3 or 5");
		System.out.println("Please enter two numbers: ");
		Scanner input = new Scanner(System.in);
		number1 = input.nextInt();
		number2 = input.nextInt();
		
		System.out.println("Plese enter the upper limit: ");
		upperLimit = input.nextInt();
		
		// Compute sum of numbers that are multiples of number1 and number2
		for (int counter = 1; counter < upperLimit; counter++, remainder1 = remainder2 = 0) {
			remainder1 = counter % number1;
			if (remainder1 == 0) {
				partSum1 += counter;
			}
			remainder2 = counter % number2;
			if (remainder2 == 0 && remainder1 != 0) {
				partSum1 += counter;
			}
			System.out.println("Remainder: " + remainder1 + ", Part Sum: " + partSum1);
		}
		System.out.printf("Sum of multiples of %d: %d\n", number1, partSum1);
	}

}
