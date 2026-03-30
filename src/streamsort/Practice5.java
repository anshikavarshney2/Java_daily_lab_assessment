package streamsort;

import java.util.Arrays;
import java.util.List;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(27,4,19,11,35,2);
		System.out.println(list);
		List<Integer> sortedList=list.stream().sorted().toList();
		System.out.println(sortedList);

	}

}
