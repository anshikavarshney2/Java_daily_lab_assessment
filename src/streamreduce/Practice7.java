package streamreduce;

import java.util.Arrays;
import java.util.List;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//convert list into single string
		List<String> list=Arrays.asList("Java","Stream","API","Reduce");
		String finalList=list.stream().reduce("",(a,b)->a+" "+b);
		System.out.println(finalList);


	}

}
