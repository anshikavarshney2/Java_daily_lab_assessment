package minmax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//remove duplicate names("Ram", "Shyam","Ram","Amit", "Shyam", "Ravi");
	    ArrayList<String> list9=new ArrayList<>(Arrays.asList("Ram", "Shyam","Ram","Amit", "Shyam", "Ravi"));
	    List<String> str4=list9.stream().distinct().toList();
	    System.out.println(str4);

	}

}
