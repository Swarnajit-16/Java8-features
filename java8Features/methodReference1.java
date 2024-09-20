package java8Features;

interface i
{
	public void add(int a,int b);
}

public class methodReference1 {
	public static void m1(int a,int b){
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		i r=methodReference1::m1;
		r.add(19, 91);
//   i r= (a,b)->{
//	   int c;
//	   c=a+b;
//	   System.out.println(c);
//   };
   //r.add(12,17);
	   
   }
		   
    
    
    
	}


