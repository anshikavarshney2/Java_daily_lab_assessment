package streamreduce;

import java.util.Arrays;
import java.util.List;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(12,34,56,78);
		int sum=list.stream().map(n->n/10+n%10).reduce(0,(a,b)->a+b);
		System.out.println("Sum of total digit="+ sum);
		


	}

}
