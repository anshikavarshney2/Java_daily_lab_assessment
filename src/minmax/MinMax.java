package minmax;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list5=new ArrayList<>(Arrays.asList(12,5,20,8,30,5,8));
	    int secmin=list5.stream().distinct().min((a,b)->a-b).get();
	    System.out.println(secmin);
		
	}

}
