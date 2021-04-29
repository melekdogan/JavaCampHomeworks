
public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"C#-Angular","Engin Demiro�");
		Course course2=new Course(1,"Programlama Temelleri","Engin Demiro�");
		Course course3=new Course(1,"Java-React","Engin Demiro�");
		Course[] courses= {course1,course2,course3};
		
		CourseManager courseManager=new CourseManager();
		
		for(Course course: courses) {
			courseManager.joinCourse(course);
		}
		
		CreditCard creditCard1= new CreditCard("Melek Do�an", "2000939039999309", "11/29", "192", "Turkey", "34210");
		CreditCard creditCard2= new CreditCard("Melek Do�an", "2000939039999309", "11/29", "192", "Turkey", "34210");
		CreditCard[] cards= {creditCard1,creditCard2};
		CreditCardManager cardManager=new CreditCardManager();
		
		for(CreditCard card:cards) {
			cardManager.addCreditCard(card);
		}
	}

}
