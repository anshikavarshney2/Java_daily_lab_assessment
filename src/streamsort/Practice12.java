package streamsort;

import java.util.Arrays;
import java.util.List;

public class Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Java","SpringBoot","API","Microoservices","SQL");
		System.out.println(list);
		List<String> sortedList=list.stream().sorted((a,b)->a.length()-b.length()).toList();
		System.out.println(sortedList);

	}

}
