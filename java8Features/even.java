package java8Features;

import java.util.function.IntPredicate;
import java.util.function.Predicate;



public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Predicate<Integer> f=i->i%2==0;
     IntPredicate f=i->i%2==0;  //jokhon predicate e integer nebo tokhon intPredicate use kora besi valo.
     System.out.println(f.test(16));
    // System.out.println(f.test(17));
    
	}

}
