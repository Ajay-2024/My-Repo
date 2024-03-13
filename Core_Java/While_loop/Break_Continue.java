package While_loop;

public class Break_Continue {

	public void go() {

		System.out.println("Hello World");

		// break; // It will give compile error as break cannot be used outside of a
		// loop or a switch

		// continue; // It will give compile error as break cannot be used outside of a
		// loop

		System.out.println("Hello");
	}

	public static void main(String[] args) {
		//
		for (int i = 0; i <= 10; i++) {
			if (i == 5)
				break; // break only be used after a conditional statements like if..else and/or switch
			System.out.print(i + " "); // It will print values from 0 to 4 because as soon as i=5 it break/discontinue
										// the loop
		}
		System.out.println();
		System.out.println("...................");
		
		for (int a = 0; a <= 10; a++) {
			if (a >= 0)
				continue;
		}
		/* It will not print anything because it continues next cycle of iteration until condition is true, as soon as condition is false,
		  it comes out of loop without giving output in console. */

		for (int b = 0; b <= 10; b++) {
			if (b >= 5 && b <= 8)
				continue;
			System.out.print(b + " ");
			// Actually continue is used to skip the iterations. Here we can skip 5 to 8 from printing
		}
	}
}