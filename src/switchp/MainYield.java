package switchp;

public class MainYield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=1;
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		default:
			System.out.println("no-day");
		}
		//modify version of switch
		String result=switch(day) {
		case 1,3,4->{
			System.out.println("this is 1,3,and 4");
			yield "Monday";//that's how we can also declared ,case may be integer or string.
		}
		case 2->"Tuesday";
		default->"No-Day";
		};
		System.out.println(result);

	}

}
