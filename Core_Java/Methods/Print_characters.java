package Methods;

public class Print_characters {

	public static void main(String[] args) {
		// Calling method printCharacters()
		char alpha = ' ';
        printCharacters(alpha);
	
	}
// Create a method to print A to M characters
	static char printCharacters(char alpha) {
		char result = ' ';
		for (alpha = 'A'; alpha <= 'M'; alpha++)

	      System.out.print(alpha + " ");
		return alpha;
	}
}
