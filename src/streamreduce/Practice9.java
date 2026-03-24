package streamreduce;

import java.util.Arrays;
import java.util.List;

public class Practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(12,45,67,23,89,34,78);
		int low=list.stream().reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);
		int second=list.stream().filter(n->n!=low).reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);
		System.out.println("Second lowest="+ second);


	}

}
