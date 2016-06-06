
public class App {
	public static void main(String[] args) {
		byte byteValue = 10;
		short shortValue = 100;
		int intValue = 1000;
		long longValue = 10000;
		
		float floatValue = 10000.11f;
		double doubleValue = 100.11;
		
		System.out.println(Byte.MAX_VALUE + ", " + Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE + ", " + Short.MIN_VALUE);
		System.out.println(Long.MAX_VALUE + ", " + Long.MIN_VALUE);
		System.out.println(Float.MAX_VALUE + ", " + Float.MIN_VALUE + ", " + Float.MAX_EXPONENT);
		
		intValue = (int)longValue;
		System.out.println(intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		// Won't work - buffer overflow
		// 128 is too big a value for byte type
		byteValue = (byte)128;
		System.out.println(byteValue);
		
		
	}

}
