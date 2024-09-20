package java8Features;

import java.util.function.Supplier;

public class otpGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Supplier<String> g=()->{
String otp="";
int i;
for(i=0;i<6;i++){
	otp=otp+(int)(Math.random()*10);
}
return otp;
};
System.out.println(g.get());
	}

}
