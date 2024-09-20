package java8Features;
import java.util.function.*;

public class stringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Function<String,Integer> g= s->s.length();
     System.out.println(g.apply("swarnajit"));
	}

}
