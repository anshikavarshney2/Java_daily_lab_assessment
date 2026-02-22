package java8;
interface Calc{
	void calculate(int n1,int n2);
	default void calculate(int n1,int n2,int n3) {
		int s=n1+n2+n3;
		//System.out.println("Sum="+s);
		getPrivateInfo("Sum="+s);
	}
	static String getInfo() {
		return "this is static getinfo method inside calc interface";
	}
	private void getPrivateInfo(String msg) {
		System.out.println(msg);
	}
}
class Calculator implements Calc{

	@Override
	public void calculate(int n1, int n2) {
		// TODO Auto-generated method stub
		int s=n1+n2;
			System.out.println("Sum="+s);
	}
	public void calculate(int n1,int n2,int n3) {
		int s=n1+n2+n3;
		System.out.println("Sum of 3 no.="+s);
	}
}
public class MainInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		c.calculate(12, 14);
		c.calculate(12,13,13);
		System.out.println(Calc.getInfo());

	}

}
//A default method is a method inside an interface that has a body and is declared using the default keyword
//interface-blueprint of a class before version 1.8 in java+ you can also define public static default private
