
public class Main {

	public static void main(String[] args) {
	 Student student=new Student();
	 student.setId(1);
	 student.setFirstName("Melek");
	 student.setLastName("Doğan");
	 student.setEmail("melekdogand@gmail.com");
	 student.setpassword("123456m");
	 
	 Student student2=new Student();
	 student2.setId(1);
	 student2.setFirstName("ornek");
	 student2.setLastName("ornek");
	 student2.setEmail("ornekmail@gmail.com");
	 student2.setpassword("1234s838m");
	 
	 Instructor instructor=new Instructor();
	 instructor.setId(1);
	 instructor.setFirstName("Engin");
	 instructor.setLastName("Demiroğ");
	 instructor.setEmail("engindemirog@outlook.com");
	 instructor.setpassword("172738");
	 
	 Student[] students= {student, student2}; 
	 
	 
	 InstructorManager instructorManager=new InstructorManager();
	 instructorManager.add(instructor);
	 
	 UserManager userManager=new UserManager();
	 userManager.add(instructor);
	 
	 StudentManager studentManager=new StudentManager();
	 studentManager.add(student);
	 studentManager.list(students);
	 
	 
	 
	 
	}

}
