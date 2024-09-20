package java8Features;

import java.util.function.Function;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Function<Integer, Integer> f=i->i*i;
        System.out.println(f.apply(4));
        System.out.println(f.apply(5));
	}

}
