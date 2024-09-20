package java8Features;

import java.util.Scanner;
import java.util.function.*;




interface Predicate<String> {
	public boolean test(String t);
}

//class caz implements Predicate<String> {
//	public boolean test(String t) {
//		if (t.length() > 5) {                   //Implementation class for FI created (line 12-22)
//			return true;
//		} 
//		else {
//			return false;
//		}
//
//	}
//}
//(String t)->(t.length()>5);                      
//t->t.length()>5;                             //for only reference lambda exp replaced the caz implementation class line 23,24

public class predefinedFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Predicate<String> f=t->t.length()>5;         // usingDefaultConstructor lambda exp to call fi and pass the string value line 32,33
		// System.out.println(f.test("swarna"));
		 
		Scanner input = new Scanner(System.in);      //trying to get value from user line 35-38
		System.out.println("enter a string:");
		String str;
	str = input.nextLine();
//	    Predicate<String> f = new caz();                  //creating obj
	    boolean d= f.test(str);                                //call the test method and passing the value got from user and store in boolean d
	    System.out.println(d);

	}

}

//jokhon implemented class ta enable thakbe tokhon only line 32, 33 commented hbe. Ar jodi implementd class replace kore lambda exp use kori then 
//implented class puro ta commented theakbe. dui ketrei USER input nichi