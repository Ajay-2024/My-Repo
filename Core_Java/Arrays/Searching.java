package Arrays;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
		int key;
		System.out.println("Enter a key: ");
		key = sc.nextInt();

		for (int i = 0; i < s.length; i++) {

			if (key == s[i]) {
				System.out.println("Key/Element found at index " + i);
				break;
				//System.exit(0);
			}
			/*else {
				System.out.println("Key/Element is not found");
			}*/

		}
		System.out.println("Key/Element is not found");
	}

}

/*
 * exit():
exit() is a method in the System class, used to terminate the currently running Java Virtual Machine (JVM). 
It takes an integer argument representing the status code, where a non-zero status code typically indicates abnormal termination.
It is generally used to immediately terminate the program execution, often in situations where further execution is not meaningful or desired. 
It halts the entire program, not just a specific loop or method.
It's not typically used directly within a loop for searching for an element but rather for application-wide control flow.
 * 
 * break:
break is a keyword used to exit from a loop prematurely. It's commonly used in loops to terminate the loop iteration and continue with the code following the loop.
It's useful when searching for an element in an array or collection and you want to exit the loop once the element is found.
Unlike exit(), break does not terminate the entire program but only exits the loop in which it is used.
 * */

