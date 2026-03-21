package mappractice;
import java.util.Arrays;
import java.util.List;

public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1st program
//		List<String> numbers=Arrays.asList("sachin","rahul","amit");
//		System.out.println(numbers);
//		List<String> result=numbers.stream().map(n->n.toUpperCase()).toList();
		//.collect(Collectors.toList()) this is used instead of toList() if want to update
//		System.out.print(result);

		
		
//2nd program
//		List<Integer> numbers=Arrays.asList(1,2,3,4);
//		System.out.println(numbers);
//		List<Integer> result=numbers.stream().map(n->n*n).toList();
//		System.out.print(result);
		
		
//3rd program
//		List<String> numbers=Arrays.asList("Java","Python","C");
//		System.out.println(numbers);
//		List<Character> result=numbers.stream().map(n->n.charAt(0)).toList();
//		System.out.print(result);
		

//4th program
//		List<Integer> numbers=Arrays.asList(10,20,30);
//		System.out.println(numbers);
//		List<String> result=numbers.stream().map(n->n.toString()).toList();
//		System.out.print(result);
		
		
//5th program
//		List<String> numbers=Arrays.asList("A","B","C");
//		System.out.println(numbers);
//		List<String> result=numbers.stream().map(n->"item"+n).toList();
//		System.out.print(result);
		
		
//6th program
//		List<String> numbers=Arrays.asList("Java","Steam","API");
//		System.out.println(numbers);
//		List<Integer> result=numbers.stream().map(n->n.length()).toList();
//		System.out.print(result);
		
		

//8th program
		List<Integer> numbers=Arrays.asList(5,10,15);
		System.out.println(numbers);
		List<Integer> result=numbers.stream().map(n->n).toList();
		System.out.print(result);
		
		
		
	}

}
