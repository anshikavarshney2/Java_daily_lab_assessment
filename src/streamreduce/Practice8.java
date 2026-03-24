package streamreduce;

import java.util.Arrays;
import java.util.List;

public class Practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		int max=list.stream().map(n->n*n).reduce(0,(a,b)->a+b);
		System.out.println("Sum="+ max);
	}

}
