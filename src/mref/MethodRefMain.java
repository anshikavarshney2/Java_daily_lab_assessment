package mref;//method reference is used for reusability.

class Calculator{
	Calculator(){
		System.out.println("This is constructor!");
		}
	     Calculator(int n1,int n2){
		System.out.println("Division: "+(n1/n2));
	}
	int sub(int n1,int n2) {
		return n1-n2;
	}
	static int mul(int n1,int n2) {
		return n1*n2;
	}
}
@FunctionalInterface
interface Calc{
	void cal(int n1,int n2);
}

public class MethodRefMain {

	public static void main(String[] args) {
		Calculator c=new Calculator();
//		int r=c.sub(100, 25);
//		System.out.println("Subtraction="+r);//signature match with method interface
		
//		Calc c1=c::sub;//in reference passing no ()
//		int r1=c1.cal(100, 25);
//		System.out.println("Subtraction="+r1);
		
//		Calc c2=Calculator::mul;//when it declared as static then call like this
//		int m1=c2.cal(100, 25);
//		System.out.println("MUltiply="+m1);
		
		Calc c3=Calculator::new;
		c3.cal(100,2);
		
		//sub is a instance method
		

	}

}
