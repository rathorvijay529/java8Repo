import java.util.function.Function;
import java.util.function.Predicate;

/*predicate: test() ans(yes,No,True,False)(boolean)
java.utill.function.*;
java -8 :build in functional interface 
1.Predicate:test(objct t)==>boolean
2.Function:apply(v,t)===v
*t==output
*v==input
*/

public class Java8Topics {
	// you have to given number is greater than 5 or not.
	// you have to identify given number is even or not
	// you have to identify given number is greater than 5 and less than 15.
	// you have to identify given number is greater than 5 or less than 15.
	public static void main(String[] args) {
		/*Predicate<Integer> predicate = new Predicate<Integer>() {
			@Override
			public boolean test(Integer givenNumber) {
				if (givenNumber > 5)
					return true;
				else
					return false;
			}
		};*/
//lambda expression	 for Predicate functional interface.
		Predicate<Integer> predicate = givenNumber -> givenNumber > 5;
		Predicate<Integer> predicate1 = givenNumber -> givenNumber %2==0;
		Predicate<Integer> predicate2 = givenNumber -> givenNumber > 5  && givenNumber < 15;
		Predicate<Integer> predicate3 = givenNumber -> givenNumber > 5  || givenNumber < 15;
		
		
		//and default method
		Predicate<Integer> predicate4 = givenNumber -> givenNumber > 5;
		Predicate<Integer> predicate5=  givenNumber ->givenNumber < 15;
		
		//Or default method
		Predicate<Integer> predicate6 = givenNumber -> givenNumber > 5;
		Predicate<Integer> predicate7=  givenNumber ->givenNumber < 15;
		

		System.out.println("Testing of Predicate::" + predicate.test(10));
		System.out.println("Testing of Predicate for even number::" + predicate1.test(10));
		System.out.println("Testing of Predicate for even number::" + predicate2.test(10));
		System.out.println("Testing of Predicate for even number::" + predicate2.test(20));
		System.out.println("Testing of Predicate for even number::" + predicate3.test(20));
		//test of and default method
		// you have to identify given number is greater than 5 and less than 15.
		System.out.println("Testing of Predicate for and default::" + predicate4.and(predicate5).test(20));
		
		//test of Or default method
		// you have to identify given number is greater than 5 or less than 15.
         System.out.println("Testing of Predicate for or default::" + predicate4.or(predicate5).test(20));
         
       //test of and default method
     	// you have to identify given number is not greater than 5 and less than 15.
 	    System.out.println("Testing of Predicate for negote::" + predicate4.and(predicate5).negate().test(4));
		
		
		Function<Integer,Double> function=new Function<Integer,Double>(){
			@Override
			public Double apply(Integer givenValue) {
			Double	givenValue1=givenValue/2.0;
				return givenValue1;
			}
		};
		System.out.println(function.apply(20));
//lambda expression	 for Function functional interface.
		
		Function<Integer,Double> function1=	givenValue-> givenValue/2.0; 
		Function<Integer,Integer> function2=givenValue-> givenValue/2; 
		Function<Integer,Integer> function3=resultOfFunction2-> resultOfFunction2*5; 
		Function<Integer,Integer> function4=function2.andThen(function3);
		System.out.println("Testing of Function for even number::" + function1.apply(10));
		System.out.println("Testing of Function for even number::" +function4.apply(30) );
		

	}

	// java-7
	public static boolean numberCheck(Integer givenNumber) {
		if (givenNumber > 5)
			return true;
		else
			return false;
	}

	
}