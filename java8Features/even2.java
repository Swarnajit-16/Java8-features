package java8Features;
 

interface po<T>
{
	public boolean test(T t);
}
class r implements po<Integer>
{
	public boolean test(Integer i){
		return i%2==0;
	}
}
public class even2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //po<Integer> y= new r();
      po<Integer> y= t->t%2==0;  //akkane amar icha moto variable dite parbo. Ata holo impl class method er parameter er variable.
//      po<Integer> y= i->i%2==0;
      //po<Integer> y= u->u%2==0;
     System.out.println(y.test(14)) ;
      
	}

}
      