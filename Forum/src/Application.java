public class Application 
{
	public static void main(String[] args) 
	{		
		ForumUser peter = new ForumUser("kot", 40, 15, true, 
				"Piotr", "Nowak", "m�czyzna", 25, "piotr.nowak@wp.pl");
		
		String firstName = peter.getFirstName();
		String lastName = peter.getLastName();
		String sex = peter.getSex();
		int age = peter.getAge();
		String mail = peter.getMail();
		
		peter.showInfoAboutUser("Imi�: " + firstName, "Nazwisko: " + lastName, "P�e�: " + sex, 
				age,  "E-mail: " + mail);
	}
}