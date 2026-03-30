package minmax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lis9=new ArrayList<>(Arrays.asList("Ram", "Shyam","Amit", "Ravi", "Karan", "Neha" ));
	    List<String> str5=lis9.stream().limit(5).toList();
	    System.out.println(str5);

	}

}
