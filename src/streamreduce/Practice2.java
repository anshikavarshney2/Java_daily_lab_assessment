package streamreduce;

import java.util.Arrays;
import java.util.List;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(2,3,4,5);
		int multiply=list.stream().reduce(1,(a,b)->a*b);//terminal function-reduce
		System.out.println("Sum="+ multiply);

	}

}
