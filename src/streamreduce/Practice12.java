package streamreduce;

public class Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=12345;
	     int rel=String.valueOf(s).chars().map(c->c-'0').reduce(0,(a,b)->a+b);
	     System.out.println("sum of digits is "+rel);

	}

}
