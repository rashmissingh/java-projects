
public class Application {
	public static void main(String[] args) {
		int value = 7;
		int[] values;
		
		values = new int[3];
		
		values[0] = 10;
		System.out.println(values[0]);
		values[1] = 20;
		System.out.println(values[1]);
		values[2] = 30;
		System.out.println(values[2]);
		
		for (int i = 0; i<values.length; i++) {
			System.out.println(values[i]);
		}
		int[] nums = {1,1,3};
		for (int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
