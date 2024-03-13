package Variables;

public class operators {

	public static void main(String[] args) {
		int a = 0, b;
		b = a++ + ++a + ++a + a;
		System.out.println(a);
		System.out.println(b);
		
		int x =0, y;
		y = --x + --x + --x + x + ++x + x++;
		System.out.println(y);
		System.out.println(x);
		
		int c =0, d;
		d = c-- + c + ++c + ++c + c++ + c;
		System.out.println(d);
		System.out.println(c);


	}

}
