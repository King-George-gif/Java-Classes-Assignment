package answers;

class Student{
	String name;
	int rol_no;
	
	Student(String a, int b){
		name = a;
		rol_no = b;
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("John", 2);
		System.out.println("student name is "+student1.name+ " and roll number is "+student1.rol_no);

	}

}
