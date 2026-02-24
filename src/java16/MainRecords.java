package java16;

import java.util.*;

record Student(int sid,String name,String course) {
	
};//constructor
public class MainRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[]=new int[] {2,3,4,5,6};
		//convert array using stream
		List<Integer> listData=Arrays.stream(data).boxed().toList();//stream-flow of data
		//for each method
//		listData.forEach((value)->System.out.println(value));;//for each method pickup one one value ,fast more than for loop,built in consumer interface
		listData.forEach(System.out::println);//work as same like above,lambda function can pass
//		Student s=new Student(1,"Student 1","MCA");
//		System.out.println(s.sid());
//		System.out.println(s.name());
//		System.out.println(s.course());
//		System.out.println(s);//all variables are private short form of encapsulation	
		

	}

}
