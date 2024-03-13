package Methods_creation;

public class CharactersAtoM {
	
	static void printChar(char starts, char ends) {
		
		for(; starts<=ends; starts++) {
		
		System.out.print(starts + " ");
		}
	}
	public static void main(String[] args) {
		printChar('A', 'M');
	}
}
