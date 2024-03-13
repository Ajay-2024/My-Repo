package While_loop;

public class Nested_Loop {

	public static void main(String[] args) {
		/* To run while loop-->3
		 * for loop--> 4
		 * do-while loop---> 5 times
		 * SO in total Nested Loop will run 3*4*5 = 60 times
		 * Firstly outer Loop will be executed i.e While Loop then--> For Loop and finally--> do-while loop executed but 
		 * increment is firstly done for inner loop i.e do-while loop then--> For Loop and finally While Loop
		 * So Execution done- inwards and Increment done- Outwards
		 * Each loop should be independent of outer loop
		 */
		int i = 0;
		
		int count =0;
		
		while(i<3)
		{
			for(int j=0; j<4; j++)
			{
				int k = 0;
				do {
					System.out.println("i---->"+i + "  j---->"+j + "  k---->"+k);
					k++;
					count++;
				}while(k<5);
			}
			 
			i++;
		}
		System.out.println("Total Iterations = " + count);
	}
}
