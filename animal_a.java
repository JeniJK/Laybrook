package Interviewprogram;

public class animal_a {

	public void display()
	{
		System.out.println("I am from animal family");
	}
	public void display1()
	{
		System.out.println("I am from Wield animal family");
	}
	public void display2()
	{
		System.out.println("I am from Pet animal family");
	}
	public static void main(String[] args) {
		dog d= new dog();
		d.display();
		d.display2();
	}

}
 class dog extends animal_a{
	
}