package streamreduce;

import java.util.Arrays;
import java.util.List;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(12,45,7,89,23,56);
		int max=list.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);//terminal function-reduce
		System.out.println("Sum="+ max);

	}

}
