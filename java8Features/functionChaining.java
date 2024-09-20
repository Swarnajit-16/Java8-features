package java8Features;
import java.util.function.Function;


public class functionChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Function<Integer,Integer>f1=i->i*3;
     Function<Integer,Integer>f2=i->i*i;
     System.out.println(f1.andThen(f2).apply(2));
     System.out.println(f1.compose(f2).apply(2));
	}

}
