package java8Features;
import java.util.function.*;

interface predi<T> {
	public boolean test(T t);
}

public class checkNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		predi<Integer> h = r -> r >= 10; //r holo impl class er method er parameter.
		int[] arr = { 2, 6, 7, 10, 13, 17, 21 };
		for (Integer e : arr) {
			if (h.test(e)) {
				System.out.println(e);
			}
		}
	}

}
