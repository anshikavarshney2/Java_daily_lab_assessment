package streamreduce;

import java.util.Arrays;
import java.util.List;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Java","Programming","Stream","API","Functional");
		String length=list.stream().reduce("",(a,b)->a.length()>b.length()?a:b);
		System.out.println("length="+ length);


	}

}
