package streamsort;

import java.util.Arrays;
import java.util.List;

public class SortedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(23,12,1,45,23,76,26,91);
		System.out.println(list);
		List<Integer> sortedList=list.stream().sorted((a,b)->b-a).toList();//a,b->b-a descending order,a-b ascending order
		System.out.println(sortedList);

	}

}
