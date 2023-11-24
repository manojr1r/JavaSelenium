package JavaSelenium.oops.inhertence;

public class Parent extends SuperClass{
	int a;
	//constructor
	public Parent(int a){
		super(a);
		System.out.println("Parent class Constructor bird fly");
		this.a=a;
	}
	
	void fly() {
		System.out.println("flying");
	}
}
