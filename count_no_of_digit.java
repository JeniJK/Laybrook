package Interviewprogram;

public class count_no_of_digit {

	public static void main(String[] args) {
		int num=456987963;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
          System.out.println("No of digit count is : "+count);
	}

}
