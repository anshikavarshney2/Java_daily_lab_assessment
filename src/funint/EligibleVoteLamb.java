package funint;
//@FunctionalInterface
//interface Vote{
//	void checkEligibility(int age);
//}
//public class EligibleVoteLamb {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Vote v=(age)->{
//			if(age>=18) {
//				System.out.println("you can vote");
//			}else {
//				System.out.println("you can not vote");
//			}
//		};
//		v.checkEligibility(20);
//   }
//
//}

class Votermain {
  // ✅ Define a method named Eligible that matches CanVote
  void Eligible(int age) {
    if(age>=18){
      System.out.println("You are eligible to vote");
    } else {
      System.out.println("You are not eligible to vote");
    }
  }
}

@FunctionalInterface
interface CanVote {
  void Eligible(int age);
}

public class EligibleVoteLamb {
  public static void main(String[] args) {
    // Lambda version
    CanVote a1 = (int age) -> {
      if(age>=18){
        System.out.println("You are eligible to vote");
      } else {
        System.out.println("You are not eligible to vote");
      }
    };
    a1.Eligible(19);

    // ✅ Method reference version
    Votermain v = new Votermain();
    CanVote v1 = v::Eligible; // method reference
    v1.Eligible(17);
  }
}

