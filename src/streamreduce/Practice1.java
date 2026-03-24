package streamreduce;

import java.util.Arrays;
import java.util.List;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(10,20,30,40,50);
		int sum=list.stream().reduce(0,(a,b)->a+b);//terminal function-reduce
		System.out.println("Sum="+sum);

	}

}
