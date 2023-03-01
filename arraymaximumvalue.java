package Interviewprogram;

public class arraymaximumvalue {

	public static void main(String[] args) {
		int a[]= {50,20,40,80,70,90,200,10,150,300};
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println("Max Values is : "+max);
	}

}
