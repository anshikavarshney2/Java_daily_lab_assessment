package minmax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//skip first 5 and print next 3
	    ArrayList<Integer> list7=new ArrayList<>(Arrays.asList(5,10,15,20,25,30,35,40,45));
	    List<Integer> sk2=list7.stream().skip(5).limit(3).toList();
	    System.out.println(sk2);

	}

}
