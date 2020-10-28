package FirstOne;
public class ClassRoom {
	private String students="40";
	private String benches="30";
	private String books="2";
	public void MyClass() {
		
		System.out.println("Group of students");
	}
	public static void main (String[] args) {
		System.out.println("this is my class");
		ClassRoom objectReference=new ClassRoom();
		objectReference.MyClass();
	}

} 
