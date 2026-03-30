package minmax;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;
import java.util.Optional;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//skip first 5 and print next 3
	    ArrayList<String> list=new ArrayList<>(Arrays.asList("Ram","Shyam","Amit","Zoya","Ravi"));
	    Optional<String> l1=list.stream().min((a,b)->a.compareTo(b));
	    System.out.println(l1);
	    

	}

}
