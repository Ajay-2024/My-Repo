package Strings;

final class Immutable {
	final String name;
	final int salary;

	Immutable(String s1, int num) {
		this.name = s1;
		this.salary = num;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
}

public class Immutable_Class {

	public static void main(String[] args) {
		Immutable t1 = new Immutable("Ajay", 25000);
		System.out.println(t1.getName());
		System.out.println(t1.getSalary());

		// change its data variable value create new object
		Immutable t2 = new Immutable("Aman", 250000);
		System.out.println(t2.getName());
		System.out.println(t2.getSalary());

	}

}
