package java8Features;

import java.util.Scanner;

interface Function<T, R> {
	public R apply(T t);

	
}

class stud implements Function<String, Integer> {
	public Integer apply(String arr1) {
		switch (arr1.toUpperCase()) {
		case "A":
			return 90;

		case "B":
			return 70;

		case "C":
			return 60;

		case "D":
			return 40;

		case "E":
			return 30;

		default:
			throw new IllegalArgumentException("invalid grade:"+arr1);
		}

	}
}

//class student {
//	String grade;
//	int marks;
//
//	student(String grade, int marks) {
//		// TODO Auto-generated constructor stub
//		this.grade = grade;
//		this.marks = marks;
//	}

//	@Override
//	public String toString() {
//		return "student [grade=" + grade + ", marks=" + marks + "]";
//	}
//}

 public class gradeStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String [] arr={"A","B","C","D","E","F"};
		//Scanner input = new Scanner(System.in);
		//String arr1=null;
//		System.out.println("Enter grade:");
//		arr1 = input.nextLine();
		stud Student = new stud();
		
		// for(String s:arr1){
//		if ( arr1 == "A") {
//			int p=Student.apply(arr1);
//			System.out.println(p);}
		System.out.println(Student.apply("A"));
		System.out.println(Student.apply("B"));
		System.out.println(Student.apply("C"));
		System.out.println(Student.apply("D"));
		System.out.println(Student.apply("E"));
		System.out.println(Student.apply("F"));
//		} else if (arr1 == "B") {
//			System.out.println(Student.apply(arr1));
//		} else if (arr1 == "C") {
//			System.out.println(Student.apply(arr1));
//		} else if (arr1 == "D") {
//			System.out.println(Student.apply(arr1));
//		} else if (arr1 == "E") {
//			System.out.println(Student.apply(arr1));
//		} else if (arr1 == "F") {
//			System.out.println(Student.apply(arr1));
//		}
	}
}

// }
