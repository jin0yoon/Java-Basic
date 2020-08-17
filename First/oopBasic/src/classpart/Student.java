package classpart;


public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}

//	public static void main(String[] args) {
//		
//		Student studentPark = new Student();
//		studentPark.studentName = "박은종";
//		studentPark.showStudentInfo();
//	}
}
