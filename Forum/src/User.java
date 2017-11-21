public class User 
{
	private String firstName;
	private String lastName;
	private String sex;
	private int age;
	private String mail;
	
	public User(String firstName, String lastName, String sex, int age, String mail)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.age = age;
		this.mail = mail;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public String getSex()
	{
		return this.sex;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public String getMail()
	{
		return this.mail;
	}
	
	public void login()
	{
		System.out.println("Zaloguj się");
	}
	
	public void logout()
	{
		System.out.println("Zostałeś wylogowany!");
	}
	
	public void deleteAccount()
	{
		System.out.println("Usunięcie konta");
	}
}
