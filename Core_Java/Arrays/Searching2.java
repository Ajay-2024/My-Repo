package Arrays;

public class Searching2 {

	public static void main(String[] args) {
		int[] s = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
		int key = 9;

		for (int i = 0; i < s.length; i++) {

			if (key == s[i]) {
				System.out.println("Key/Element found at index " + i);
				break;
				//System.exit(0);
			}
			else {
				System.out.println("Not found at index " + i );
			} 
		} 
		//System.out.println("Key/Element is Not found");
	}
}
