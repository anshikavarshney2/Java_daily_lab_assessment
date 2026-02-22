abstract class Shop{
	public abstract void order(String dish);
	public void message() {
		System.out.println("Welcome to the shop");
	}
}
class Person1 extends Shop{
	String dish;
	public void order(String dish) {
		this.dish=dish;
		System.out.println(dish+" "+"is ordered");
	}
}
public class abstr {

	public static void main(String[] args) {
		Person1 p1=new Person1();
		p1.message();
		p1.order("pizza");
		

	}

}
