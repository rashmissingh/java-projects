/* print - prints it literally 
 * println - prints a line at the end
 * printf - takes a format string
 */
public class App {

	public static void main(String[] args) {
		// Inefficient
		String info = "";
		
		info += "My name is Rashmi.";
		info += " ";
		info += "I am a dreamer.";
		System.out.println(info);
		
		// efficient
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Rashu.");
		sb.append(" ");
		sb.append("I am a reader.");
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		
		s.append("My name is Binny.").append(" ")
		.append("I am a scuba diver");
		System.out.println(s.toString());
		
		/////// Formatting ///////
		System.out.print("This is some text.\tThat was a tab.\nThat was a newline.");
		System.out.println(" Some more text");
		
		// Formatting integers
        // %-10d means: output an integer in a space ten characters wide,
        // padding with space and left-aligning (%10d would right-align)
		System.out.printf("The cost: %5d, quantity: %10d\n", 5, 100);
		System.out.printf("The cost: %-5d, quantity: %-10d\n", 5, 100);
		
		for (int i = 8; i <=12; i++) {
			System.out.printf("%-2d: some text\n", i);
		}
		
		//Formatting floating point numbers
		// 3 decimal place, padding with space, right aligned 
		System.out.printf("The cost: %2.3f\n", 5.6);
		
		// One decimal place, left-aligned in 6-character field:
        System.out.printf("Total value: %-6.1fn", 343.23423);
        
        // You can also use the String.format() method if you want to retrieve
        // a formatted string.
        String formatted = String.format("This is a floating-point value: %.3f", 5.12345);
        System.out.println(formatted);
        
        // Use double %% for outputting a % sign.
        System.out.printf("Giving it %d%% is physically impossible.", 100);

	}

}
