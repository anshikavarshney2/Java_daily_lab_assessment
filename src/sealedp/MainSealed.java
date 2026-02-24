package sealedp;
sealed class Shape permits Circle,Rectangle{
//A sealed class in Java is a class that restricts which other classes can extend or inherit it.
//It allows the developer to control the class hierarchy by specifying permitted subclasses using the permits keyword.
//class declared with sealed keyword
}

final class Circle extends Shape{//final,sealed,non-sealed we can declare by these three method
	
}

non-sealed class Rectangle extends Shape{//anyone can inhert
	
}

public class MainSealed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
