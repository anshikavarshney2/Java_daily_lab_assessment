package streamapi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
//import java.util.function.Consumer;

public class FilterAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//integer
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(24);
		list.add(23);
		list.addAll(List.of(28,34,56,67));
		System.out.println(list);
		//Stream listStream=list.stream();
		list.stream().filter(n->n>60).forEach((element)-> System.out.print(element+" "));
		//list.stream().forEach(System.out::println);//method referencing
		System.out.println();
		System.out.println("Count="+list.stream().filter((item)->item>60).count());
		
//string
//		ArrayList<String> list=new ArrayList<String>();
//		list.add("ram");
//		list.addAll(List.of("shyam","harshit","akansha"));
//		System.out.println(list);
//		Stream listStream=list.stream();
//		list.stream().forEach((element)-> System.out.print(element+" "));
//		list.stream().forEach(System.out::println);
//		

	}

}
