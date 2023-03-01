package Interviewprogram;

import java.lang.reflect.Array;
import java.util.Arrays;
public class arrayareequals_arenot {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int a1[]= {1,2,3,4,5,6};
     
		boolean status=Arrays.equals(a,a1);
		
		if(status==true)
		{
			System.out.println("Arrays are Equals ");
		}
		else
		{
			System.out.println("Arrays are NOt Equals ");
		}
	}

}
