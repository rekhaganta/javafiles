package FirstOne;

public class Multiplication {
	private int var1 = 5;
	private int var2 = 4;


	public Multiplication() {
		System.out.println("Given that");

	}
	public int mul() { 
		int mul=var1*var2;
		return mul;
	}
	public static void main(String[] args) {
		Multiplication mulref=new Multiplication();
		int mul=mulref.mul();
		System.out.println("mul of two numbers="+mul);
	}

}
