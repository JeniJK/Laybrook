package Interviewprogram;


public class array_addnumber {

	public static void main(String[] args) {
		/*int [] num=  {1,2,3,4,5,6,8};
		int sum=0;
		
		for(int i=0; i<=num.length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println("Sum of Arrry element: "+sum);
		
		/*for(int value:num)
		{
			sum=sum+value;
			
		}
		System.out.println("Sum of Arrry element: "+sum);
		
		int [] arr = new int [] {1, 2, 3, 4, 5};  
        int sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum); */
		
		int a[]=new int []{1,2,3,4,5,6,7,8,9};
		int sum=0;
		int len=a.length;
		System.out.println(len);
		for(int i=0; i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of all the elements of an array: " + sum);
		
		
	}

}
