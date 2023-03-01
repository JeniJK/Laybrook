package Interviewprogram;

interface driving
{
	 void drive();
}
interface sleeping
{
	 void sleep();
}
public class Bus_interface implements driving,sleeping{
public void drive()
 {
	 System.out.println("My drive name is Jayaraj");
 }
public void sleep()
{
	 System.out.println("Drive is sleeping");
}
	public static void main(String[] args) {
		Bus_interface b1=new Bus_interface();
		b1.drive();
		b1.sleep();
	}
}

