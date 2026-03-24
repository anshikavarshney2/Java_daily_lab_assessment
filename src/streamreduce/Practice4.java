package streamreduce;

import java.util.Arrays;
import java.util.List;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(34,12,98,5,76,2);
		int min=list.stream().reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);//terminal function-reduce
		System.out.println("Minimum value="+ min);


	}

}
