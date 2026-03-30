package streamsort;

import java.util.Arrays;
import java.util.List;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");
		System.out.println(list);
		List<String> sortedList=list.stream().sorted().toList();
		System.out.println(sortedList);

	}

}
