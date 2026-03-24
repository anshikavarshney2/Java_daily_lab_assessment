package streamreduce;

import java.util.Arrays;
import java.util.List;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(10,20,30,40,50,60,70);
		int count=list.stream().reduce(0,(a,b)->a+1);
		System.out.println("Count="+ count);


	}

}
