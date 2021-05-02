package thirdDayHomework;
public class StudentManager extends UserManager {
	
	public void add(Student student) {
		System.out.println(student.getFirstName()+": ��renci  eklendi!");
	}
	
	public void list(Student[] students) {
		for (Student student : students) {
			System.out.println(student.getFirstName()+" "+ student.getLastName());
		}
	}
}
