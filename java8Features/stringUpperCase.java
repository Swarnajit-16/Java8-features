package java8Features;
import java.util.function.*;

public class stringUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Function<String, String> f=s->s.toUpperCase();
     System.out.println(f.apply("swarna"));
	}

}
