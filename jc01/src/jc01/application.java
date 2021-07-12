package jc01;

public class application {
	
	public static void main(String[] args) {
		byte b = 1;
		int a = 5; 
		float f = 1.5f;
		double d = 4.67;
		short s = 7;
		long l = 568;
		boolean b1 = true;
		char c = 'c'; 
		
		System.out.println("Max Int -> " +Integer.MAX_VALUE);
		System.out.println("Max Short -> " +Short.MAX_VALUE);
		System.out.println("Max Long -> " +Long.MAX_VALUE);
		System.out.println("Max Float -> " +Float.MAX_VALUE);
		System.out.println("Max Double -> " +Double.MAX_VALUE);
		System.out.println("Max Char -> " +(Character.MAX_VALUE+0));
		System.out.println("--------------------");
		System.out.println("Min Int -> " +Integer.MIN_VALUE);
		System.out.println("Min Short -> " +Short.MIN_VALUE);
		System.out.println("Min Long -> " +Long.MIN_VALUE);
		System.out.println("Min Float -> " +Float.MIN_VALUE);
		System.out.println("Min Double -> " +Double.MIN_VALUE);
		System.out.println("Min Char -> " +(Character.MIN_VALUE+0));
		
		int []arr = new int[10];
		for(int i=0; i<10; i++)
		{
			arr[i]=(int)(1+Math.random()*100);
		}
		int min = 0, max = 0;
		min = arr[0];
		max=arr[0];
		for(int n=1; n<10; n++)
		{
			if(arr[n]<min)
			{
				min = arr[n];
			}
			if(arr[n]>max)
			{
				max = arr[n];
			}
			
		}
		System.out.println("--------------------");
		System.out.println("Max of array -> "+max);
		System.out.println("Min of arrray -> "+min);
	}
}
