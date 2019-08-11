package assignment3;

public class Overload {
	public void overloadMethod() {
		System.out.println("overloadMethod with no parameters");
	}
	public void overloadMethod(int i) {
		this.overloadMethod();
		System.out.println("overloadMethod with 1 parameter: " + i);
	}
	
	public static void main(String[] args) {
		Overload ol = new Overload();
		ol.overloadMethod(3);
	}
}
