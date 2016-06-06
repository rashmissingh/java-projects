import java.util.Scanner;

/* Multiples of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {
	public static void main(String[] args) {
		int counter = 0, remainder1 = 0, remainder2 = 0;
		int partSum1 = 0, partSum2 = 0;
		
		int number1 = 0, number2 = 0;
		int upperLimit = 0;
		
		System.out.println("Problem: Multiples of 3 or 5");
		System.out.println("Please enter two numbers: ");
		Scanner input = new Scanner(System.in);
		number1 = input.nextInt();
		number2 = input.nextInt();
		
		System.out.println("Plese enter the upper limit: ");
		upperLimit = input.nextInt();
		
		// Compute sum of numbers that are multiples of 3
		while (counter < upperLimit) {
			remainder1 = counter % number1;
			if (remainder1 == 0) {
				partSum1 += counter;
				System.out.println("Remainder: " + remainder1 + ", Part Sum: " + partSum1);
			}
			counter++;
			remainder1 = 0;
		}
		System.out.printf("Sum of multiples of %d: %d\n", number1, partSum1);
		counter = 0;
		remainder1 = 0;
		// Compute sum of numbers that are multiples of 5 
		while (counter < upperLimit) {
			remainder1 = counter % number2;
			if (remainder1 == 0) {
				remainder2 = counter % number1;
				if (remainder2 != 0) {
					partSum2 += counter;
				}
			}
			counter++;
			remainder1 = 0;
			remainder2 = 0;
		}
		System.out.printf("Sum of multiples of %d: %d\n", number2, partSum2);
		System.out.printf("Sum of multiples of %d or %d: %d\n", number1, number2, partSum1 + partSum2);
	}

}
