package staticex;

public class StudentIDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Student.getSerialNum());

		Student studentLee = new Student("Lee");
		System.out.println(studentLee.serialNum);
		
		Student studentKim = new Student("Kim");
		System.out.println(studentKim.serialNum);
		
		System.out.println(studentLee.serialNum);
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
	}

}
