package streamsort;

import java.util.Arrays;
import java.util.List;

public class Practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(17,63,29,81,4,50);
		System.out.println(list);
		List<Integer> sortedList=list.stream().sorted((a,b)->b-a).toList();
		System.out.println(sortedList);

	}

}
