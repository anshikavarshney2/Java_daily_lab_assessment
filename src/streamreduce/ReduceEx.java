package streamreduce;

import java.util.Arrays;
import java.util.List;

public class ReduceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(34,12,45,76,34,56,54,32);
		double avg=list.stream().reduce(0,(a,b)->a+b)/list.size();//terminal function-reduce
		System.out.println("Sum="+avg);
		}

}
