package streamsort;

import java.util.Arrays;
import java.util.List;

public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(25,14,50,33,45,18,60);
		System.out.println(list);
		List<Integer> sortedList=list.stream().filter(n->n%5==0).sorted((a,b)->b-a).toList();
		System.out.println(sortedList);

	}

}
