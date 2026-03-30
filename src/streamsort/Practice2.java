package streamsort;

import java.util.Arrays;
import java.util.List;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(45,11,78,2,90,34);
		System.out.println(list);
		List<Integer> sortedList=list.stream().sorted((a,b)->b-a).toList();
		System.out.println(sortedList);
	}

}
