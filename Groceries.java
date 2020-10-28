package FirstOne;
public class Groceries {
	private String staff="40";
	private String vegetables="all";
	private String chocolates="all";
	public void Store() {
		
		System.out.println("all things are available");
	}
	public static void main (String[] args) {
		System.out.println("offers");
		Groceries objectReference=new Groceries();
		objectReference.Store();
	}

}
