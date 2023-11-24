package JavaSelenium.oops.inhertence;

public class ConstructorInvoke extends Parent {
	// even the class extends can't use method directly
// need to be either static or 
// create object
	
 public ConstructorInvoke(int a) {
		super(a);
		System.out.println("Amph constructor");
	}
void swim(){
	 System.out.println("Swiming");
 }
	public static void main(String[] args) {
		
//		Once object is created all constructors are invoked
		SuperClass amph = new SuperClass(1);
		System.out.println("----------");
		Parent amph2 = new Parent(1);
		System.out.println("----------");
		ConstructorInvoke amph3 = new ConstructorInvoke(1);

} 

}
