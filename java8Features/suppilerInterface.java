package java8Features;
import java.util.Date;
import java.util.function.*;

public class suppilerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Supplier<Date>f=()->new Date();
     System.out.println(f.get());
	}

}
