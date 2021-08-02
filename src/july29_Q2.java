import java.util.Arrays;
import java.util.Scanner;
public class july29_Q2 {
	public static int TASK1_NthMax(int[] arr,int num,int Nth)
	{
		Arrays.sort(arr);
		int count=1,mx=-1;
		for(int j=num-1;j>0;j--)
		{
			if(arr[j]!=arr[j-1])
				count++;
			if(count==Nth)
			{
				mx=arr[j-1];
				break;
			}
		}
		return mx;
	}
	
	public static void  TASK2_remDup(int[] arr,int num)
	{
		Arrays.sort(arr);
		int[] b=new int[num];
		b[0]=arr[0];
		int k=1;
		for(int i=1;i<num;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				b[k]=arr[i];
				k++;
			}
		}
		System.out.println("Array elements after removing duplicates :- ");
		for(int i=0;i<k;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	
	public static boolean isPalindrome(int num)
	{
		String s=Integer.toString(num);
		for(int i=0;i<=s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
				return false;
		}
		return true;
	}
	
	public static boolean isPrime(int num)
	{
		if(num<2)
			return false;
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
					return false;
			}
			return true;
		}
	}
	
	public static void TASK3_allPalindrome(int[] arr,int num)
	{
		System.out.println("All Palindromic Numbers in Array :- ");
		for(int i=0;i<num;i++)
		{
			if(isPalindrome(arr[i]))
				System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void TASK4_allPrime(int[] arr,int num)
	{
		System.out.println("All Prime Numbers in Array :- ");
		for(int i=0;i<num;i++)
		{
			if(isPrime(arr[i]))
				System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void TASK5_remove(int[] arr,int num)
	{
		System.out.println("Array Elements after removing all such number which contains first and last digit same :- ");
		for(int i=0;i<num;i++)
		{
			String s=Integer.toString(arr[i]);
			if(s.charAt(0)!=s.charAt(s.length()-1))
				System.out.println(arr[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		int Nth=sc.nextInt(); 
		System.out.println("NTH MAX of Array is :- "+TASK1_NthMax(arr,num,Nth));
		 int[] b1=new int[num]; 
		 TASK2_remDup(arr,num);
		 TASK3_allPalindrome(arr,num); 
		 TASK4_allPrime(arr,num);
		 		
		TASK5_remove(arr,num);
		
	}
}
