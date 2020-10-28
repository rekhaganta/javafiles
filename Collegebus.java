package FirstOne;

public class Collegebus {
	private String students="40";
	private String driver="30";
	private String seats="2";
	public void Bus() {
		
		System.out.println("only for students");
	}
	public static void main (String[] args) {
		System.out.println("only for staff");
		Collegebus objectReference=new Collegebus();
		objectReference.Bus();
	}

}
