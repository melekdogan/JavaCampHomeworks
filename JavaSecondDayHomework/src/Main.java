
public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"C#-Angular","Engin Demiroğ");
		Course course2=new Course(1,"Programlama Temelleri","Engin Demiroğ");
		Course course3=new Course(1,"Java-React","Engin Demiroğ");
		Course[] courses= {course1,course2,course3};
		
		CourseManager courseManager=new CourseManager();
		
		for(Course course: courses) {
			courseManager.joinCourse(course);
		}
		
		CreditCard creditCard1= new CreditCard("Melek Doğan", "2000939039999309", "11/29", "192", "Turkey", "34210");
		CreditCard creditCard2= new CreditCard("Melek Doğan", "2000939039999309", "11/29", "192", "Turkey", "34210");
		CreditCard[] cards= {creditCard1,creditCard2};
		CreditCardManager cardManager=new CreditCardManager();
		
		for(CreditCard card:cards) {
			cardManager.addCreditCard(card);
		}
	}

}
