
public class Application {
	public static void main(String[] args) {
		String[] names = new String[3];
		
		names[0] = "Rashmi";
		names[1] = "Arunima";
		names[2] = "Soumen";
		System.out.println(names[1]);
		
		String[] hair = {"brown", "black", "auburn"};
		for (int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		for (String name: names) {
			System.out.println(name);
		}
		
		String text = null;
		System.out.println(text);
		
		String[] texts = new String[2];
		System.out.println(texts[0]);
		
		texts[0] = "one";
		System.out.println(texts[0]);
	}

}
