// the ability of an object to have multiple forms and multiple behavior at different situation.
package poly;
class Animal{
	String name;
	String sound;
	Animal(String name,String sound){
		this.name=name;
		this.sound=sound;
	}
	void getInfo() {
		System.out.println("Name="+name);
		System.out.println("Sound="+sound);
	}
	void getInfo(String name,String sound,int legs) {
		System.out.println("Name="+name);
		System.out.println("Sound="+sound);
		System.out.println("No.of legs="+legs);
	}
}
public class Day3poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Animal a=new Animal("Horse","hingg");
       a.getInfo();
       a.getInfo("Cat","Meow",4);
	}

}
