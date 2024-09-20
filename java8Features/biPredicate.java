package java8Features;
import java.util.function.*;

public class biPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BiPredicate<Integer, Integer> u=(a,b)->(a+b)%2==0;
     System.out.println(u.test(12, 17));
	}

}
