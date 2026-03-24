package streamreduce;

import java.util.Arrays;
import java.util.List;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(11,22,33,44,55,66,77,88);
		int sum=list.stream().filter(n->n%2==0).reduce(0,(a,b)->a+b);
		System.out.println("Sum of even number="+ sum);

	}

}
