package streamsort;

import java.util.Arrays;
import java.util.List;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(14,9,20,7,6,11,32,3);
		System.out.println(list);
		List<Integer> sortedList=list.stream().filter(n->n%2==0).sorted((a,b)->a-b).toList();
		System.out.println(sortedList);

	}

}
