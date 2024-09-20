package java8Features;

import java.util.function.*;

interface P<String> {
	public boolean test(String str1);

}

//class z implements P<String> {
//
//	public boolean test(String str1) {
//
//	//return str.length() > 5;
//	return str.length()%2== 0;
//		
//
//	}
//}

public class lengthArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P<String> f =  str1->str1.length()%2== 0; //str1 is impl class method parameter.
		String[] s = { "rahim", "jayanta", "ramana", "swarna", "raj" };
		//P<String> f = new z();
		for (String str : s) {
			if (f.test(str)) {
				System.out.println(str);
			}
		}
	}

}
