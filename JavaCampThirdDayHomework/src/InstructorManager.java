
public class InstructorManager extends UserManager {
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+": E�itmen  eklendi!");
	}
	public void list(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println(instructor.getFirstName()+" "+instructor.getLastName());
		}
	}
	
}
