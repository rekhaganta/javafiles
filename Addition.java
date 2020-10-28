package FirstOne;

public class Addition {
	private int var1 = 1;
	private int var2 = 4;
	private int var3 = 4;
	public Addition() {
		System.out.println("Given that");
	}
	public int add() {
		int sum=var1+var2+var3;
		return sum;
	}
	public static void main(String[] args) {
		Addition addref=new Addition();
		int sum=addref.add();
		System.out.println("sum of three numbers="+sum);
	}

}
