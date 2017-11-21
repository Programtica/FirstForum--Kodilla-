public class ForumUser extends User
{
	private String username;
	private int numberOfPosts;
	private int numberOfAnswers;
	private boolean isLogged;
	
	public ForumUser(String username,
			int numberOfPosts, int numberOfAnswers, boolean isLogged,
			String firstName, String lastName, String sex, int age, String mail)
	{
		super(firstName, lastName, sex, age, mail);
		
		this.username = username;
		this.numberOfPosts = numberOfPosts;
		this.numberOfAnswers = numberOfAnswers;
		this.isLogged = isLogged;	
	}
	
	public String getUsername()
	{
		return this.username;
	}

	public int getNumberOfPosts()
	{
		return this.numberOfPosts;
	}
	
	public int getNumberOfAnswers()
	{
		return this.numberOfAnswers;
	}
	
	public boolean getIsLogged()
	{
		return this.isLogged;
	}
	
	public void publicAPostOnAForum()
	{
		System.out.println("Napisz ten post");
		System.out.println("Opublikuj");
	}
	
	public void commentBelowPostOnAForum()
	{
		System.out.println("Napisz odpowiedŸ");
		System.out.println("Opublikuj");
	}
	
	public void showInfoAboutUser(String firstName, String lastName, String sex, int age,
			String mail)
	{
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(sex);
		System.out.println("Wiek: " + age);
		System.out.println(mail);
		System.out.println("Nazwa u¿ytkownika: " + username);
		System.out.println("Liczba postów: " + numberOfPosts);
		System.out.println("Liczba odpowiedzi: " + numberOfAnswers);
		
		if(isLogged == true)
		{
			System.out.println("Zalogowany: TAK");
		}
		
		else
		{
			System.out.println("Zalogowany: NIE");
		}
	}
}