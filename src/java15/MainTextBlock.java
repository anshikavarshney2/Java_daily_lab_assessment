package java15;

public class MainTextBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="""
package java10;

public class MainVar {

	public static void main(String[] args) {//var is not allowed here instead of string
		// TODO Auto-generated method stub
		int a=10;
		var b=20;
		var value=10.34;//after java10 we use var keyword(local variable type inference)
//		var c;
//		c=39; not possible initalization must
		var c=0.0;
		c=39.56;//value can modify but data type must be same
		
		String name=new String("This is string");
		var name1=new String("This is string with var");//also use like this var
		int val[]=new int[] {1,2,3,4,5};
		for(var v:val) {
			System.out.println(v);//in array var also use like this
		}

	}

}
				
""";
		System.out.println(data);//to print exact code

	}

}
