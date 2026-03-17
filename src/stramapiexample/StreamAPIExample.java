package stramapiexample;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPIExample {

	public static void main(String[] args) {
//1st program 
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		list.addAll(List.of(10,15,20,25,30,11,17,16));
//		System.out.println(list);
//		list.stream().filter((n)->n%2==0).forEach((element)-> System.out.print(element+" "));
	
		
//2nd program
//		ArrayList<String> list=new ArrayList<String>();
//		list.addAll(List.of("Amit","Ravi","Anil","Vikas","Ashok","Rahul"));
//		System.out.println(list);
//		list.stream().filter(n->n.startsWith("A")).forEach((element)-> System.out.print(element+" "));
		
		
//3rd program
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		list.addAll(List.of(10,60,45,90,30,24,50,76));
//		System.out.println(list);
//		list.stream().filter((n)->n>50 && n<=60).forEach((element)-> System.out.print(element+" "));
		
		
		
//4rd program
//		ArrayList<String> list=new ArrayList<String>();
//		list.addAll(List.of("Java","Python","C","React","C#","Next.js","Node.js"));
//		System.out.println(list);
//		list.stream().filter(n->(n.length())>4).forEach((element)-> System.out.print(element+" "));
		
		
//ques5. to remove all null values from list: java, "", "spring", null, "react"
//	    ArrayList<String> str3= new ArrayList<>();
	    //it doesnt allows null 
	    // str3.addAll(List.of("Java", "", "Spring", null, "React"));
//	    str3.addAll(Arrays.asList("Java", "", "Spring", null, "React"));
//	    List s1=str3.stream().filter(s->s!=null).toList();
//	    System.out.println(s1);
	    
	    
//6th program
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		list.addAll(List.of(3,4,7,8,9,1,5,4,16));
//		System.out.println(list);
//		list.stream().filter((n)->n%2!=0).forEach((element)-> System.out.print(element+" "));   
		
		
//7th program
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		list.addAll(List.of(10,12,15,22,25,36,75));
//		System.out.println(list);
//		list.stream().filter((n)->n%5==0).forEach((element)-> System.out.print(element+" "));
		
		
//8th program
//		ArrayList<String> list=new ArrayList<String>();
//		list.addAll(Arrays.asList("Java","","Spring","","AI"));
//		System.out.println(list);
//		list.stream().filter(n->n!="").forEach((element)-> System.out.print(element+" "));
		
		
//9th program
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.addAll(List.of(10,25,40,55,70));
		System.out.println(list);
		list.stream().filter((n)->n<=50 && n>=20).forEach((element)-> System.out.print(element+" "));
		
		

	}

}
