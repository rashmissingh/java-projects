
public class Application {
	public static void main(String[] args) {
		int[] values = {1,2,3};
		System.out.println(values[1]);
		
		// 2-D integer array
		int[][] grid = {
				{1,2,3},
				{4,5},
				{6,7,8}
		};
		System.out.println(grid[0][1]);
		System.out.println(grid[1][1]);
		
		// 2D string array
		String[][] texts = new String[2][3];
		texts[0][1] = "Hello there!";
		System.out.println(texts[0][1]);
		
		// Iterating 2D integer array
		for (int row=0; row < grid.length; row++) {
			for (int col=0; col<grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println("\n");
		}
		
		// Iterating 2D string array
		String[][] words = new String[3][];
		System.out.println(words[0]);
		words[0] = new String[3];
		words[0][0] = "hi there!";
		System.out.println(words[0][0]);
		System.out.println(words[0][1]);
	}

}
