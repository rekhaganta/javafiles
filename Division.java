package FirstOne;
public class Division {
	private int var1 = 6;
	private int var2 = 2;

	public Division() {
		System.out.println("Given that");
	}
	public int div() {
		int div=var1/var2;
		return div;
	}
	public static void main(String[] args) {
		Division divref=new Division();
		int div=divref.div();
		System.out.println("div of two numbers="+div);
	}

}
