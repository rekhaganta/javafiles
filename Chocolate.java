package FirstOne;
public class Chocolate {
	private String dairymilk="40";
	private String luvit="50";
	private String chocopie="50";
	public void  Choco()
	{
		System.out.println("all flavours are available");
		System.out.println("strawberry");
		System.out.println("vanilla");
		System.out.println("darkchoc");
	}
	public void strawberry()
	{
		System.out.println("dark");
		System.out.println("light");
	}
	public void vanilla()
	{
		System.out.println("mixed");
		System.out.println("plain");
	}

	public static void main (String[] args) {
		System.out.println("offers");
		Chocolate objectReference=new Chocolate();
		objectReference.Choco();
		objectReference.strawberry();
		objectReference.vanilla();

	}

}
