package streamsort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(55,12,88,34,99,21);
		System.out.println(list);
		Integer sortedList=list.stream().sorted(Comparator.reverseOrder()).toList().get(1);
		System.out.println(sortedList);

	}

}
