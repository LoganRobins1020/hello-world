package main;

public class HelloBean {
	
	public HelloBean() {
		super();
		System.out.println("bean created");
	}

	@Override
	public String toString() {
		return "HelloBean []";
	}
	
	public void sayHello() {
		System.out.println("Hello World from spring");
	}
}
