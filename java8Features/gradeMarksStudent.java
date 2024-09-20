package java8Features;
import java.util.function.*;

//interface Function<Student,String>{
//	public String apply(Student std);
//}
// class st implements Function<Student,String>{
//	public String apply(Student std){
//		//String name;
//		int marks=std.marks;
//		//String grade;
//		if( marks>=80&&marks<=100){                     
//			return "Grade-A";
//		}
//		else if(marks>=60&&marks<=79){
//			return "Grade-B";
//		}
//		else if(marks>=40&&marks <=59){
//			return "Grade-C";
//		}
//		else if(marks>=25&&marks<=39){
//			return "Grade-D";
//		}
//		else if(marks<25){
//			return "Grade-F";
//		}
//		return null;
//	}
//}
class Student{
	String name;
	String grade;
	int marks;
	
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
		
	}
	
//	public String view() {
//		return "Student [name=" + name + "-> marks=" + marks + "]";
//	}
//	
	
}

public class gradeMarksStudent {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student [] std1={ new Student("Durga",100),
    		          new Student("Suguna",99),
    		          new Student("MAhesh",79),
    		          new Student("Surya",40),
    		          new Student("sayantan",39),
    		          new Student("Prokash",25),
    		          new Student("Rachit",24),
    		          
    };
    
    Function<Student, String> g= std->{
		//String name;
		int Marks=std.marks;
		String grade=" ";
		if( Marks>=80&&Marks<=100) grade="Grade-A";
	
		else if(Marks>=60&&Marks<=79) grade="Grade-B";
		
		else if(Marks>=40&&Marks <=59)grade= "Grade-C";
		
		else if(Marks>=25&&Marks<=39)grade= "Grade-D";
		
		else if(Marks<25)grade= "Grade-F";
		
		
	return grade;
	};
	//Predicate<Student>h=s1->s1.marks<50;
    Consumer<Student> f=s1->System.out.println(s1.name+"->"+s1.marks+""+"("+g.apply(s1)+")");
    
//}
   // Function<Student,String> g =new st();     
   // for(Student s1:std1){
   // System.out.println(g.apply(s1));
   // System.out.println(s1.view());
    	//if(h.test(s1)){
   // System.out.println(s1.name+"->"+s1.marks+""+"("+g.apply(s1)+")");
    	//}
	//}
    for(Student s1:std1){
    	//if(h.test(s1))
    f.accept(s1);	
    }
    
	}
}
