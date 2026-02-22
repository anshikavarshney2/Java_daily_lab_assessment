import java.util.Scanner;
class Sum{
	public Sum(int a,int b) {
		System.out.println("sum: "+(a+b));
		
	}
}
class Multiply{
	public Multiply(int a,int b) {
		System.out.println("multiply: "+(a*b));
	}
}
public class Day1P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter two numbers:");
       int a=sc.nextInt();
       int b=sc.nextInt();
       Sum s=new Sum(a,b);
       Multiply m=new Multiply(a,b);
	}

}
