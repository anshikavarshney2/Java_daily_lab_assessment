package java16;
record Student(int sid,String name,String course) {};//constructor
public class MainRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(1,"Student 1","MCA");
		System.out.println(s.sid());
		System.out.println(s.name());
		System.out.println(s.course());
		System.out.println(s);//all variables are private short form of encapsulation
		
		
		

	}

}
