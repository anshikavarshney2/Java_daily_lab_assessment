package funint;

@FunctionalInterface
interface Calc{
	int square(int n1);
	//default void calculate(int n1,int n2,int n3){}
		//multiple default ,static,private values can make
}
public class MainFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc a1= num->num*num;//anonymous of class
		//lambda expression
	    int result=a1.square(23);
	    System.out.println("square of no.="+result);
   }

}

//It is a interface that have only one abstract method and is declared with functional interface annotation (@FunctionInterface)
//annotation is the extra information provided to the compiler.

//lambda expression-
//lambda expression is short form of declaring anonymous function,that reference is pass to the functional interface object.

//types of lambda expression-
//1- No parameter,no return type: 
//(a) ()->{} //multiple lines in function
//(b) ()-> System.out.println("Lambda Expression") //single line representation


//2- No parameter,with return type:
//(a) ()->{
         //write your lines here;
         //return 10;
         //} //multiple lines
//(b) ()->10 //return without return keyword


//3- With parameter,no return type:
//(a) with one parameter:
// (int num1)->System.out.println(num1)// with one parameter and data type

// (num1)->System.out.println(num1)    // with one parameter without data type

// num1->System.out.println(num1)

// num1->{
// System.out.println("Multiple lines");
// System.out.println(num1)
// }


//4- with parameter,with return type:
//(int num1,int num2)->num1+num2
// (int num1,int num2)->{return num1+num2}


