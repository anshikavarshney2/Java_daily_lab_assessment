package streamsort;

import java.util.Arrays;
import java.util.List;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(10,5,10,7,5,3,8,3);
		System.out.println(list);
		List<Integer> sortedList=list.stream().distinct().sorted().toList();
		System.out.println(sortedList);

	}

}
