package FirstOne;
public class Math {
	private int var1 = 1;
	private int var2 = 4;
	public Math() {
		System.out.println("I'm in constructor");
	}
	public int add() {
		int sum=var1+var2;
		return sum;
	}
	public static void main(String[] args) {
		Math mathref=new Math();
		int sum=mathref.add();
		System.out.println("sum of two numbers="+sum);
	}

}
