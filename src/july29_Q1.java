import java.util.Scanner;
public class july29_Q1 {
	public static boolean isPalindrome(String s)
	{
		for(int i=0;i<=s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		sc.close();
		StringBuilder st=new StringBuilder(s);
		//Task1 - Convert every word's last letter to upper case
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==' ')
			{
				st.setCharAt(i-1,Character.toUpperCase(s.charAt(i-1)));
			}
			else if(i==st.length()-1)
			{
				st.setCharAt(i,Character.toUpperCase(s.charAt(i)));
			}
		}
		System.out.println(st.toString());
		
		//Task2 - If the word is of odd length then convert middle letter to uppercase else convert first letter to uppercase
		String s1="";
		int start=0,end=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				if(end%2==1)
				{
					int mend=start + end-1;
					int mid=(start+mend)/2;
					st.setCharAt(mid,Character.toUpperCase(s.charAt(mid)));
					s1="";
					start=i+1;
					end=0;
				}
				else
				{
					st.setCharAt(start,Character.toUpperCase(s.charAt(start)));
					s1="";
					start=i+1;
					end=0;
				}
			}
			else
			{
				s1=s1 + s.charAt(i);
				end++;
			}
		}
		if(end%2==1)
		{
			int mend=start + end-1;
			int mid=(start+mend)/2;
			st.setCharAt(mid,Character.toUpperCase(s.charAt(mid)));
			s1="";
			/*
			 * s1=""; start=i+1; end=0;
			 */
		}
		else
		{
			st.setCharAt(start,Character.toUpperCase(s.charAt(start)));
			s1="";
			/*
			 *  start=i+1; end=0;
			 */
		}
		
		System.out.println(st.toString());
		
		
		//TASK3 - In every word if it is not palindrome then reverse it and print back the whole sentence.
		String s2="";
		int start1=0,end1=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				if(!isPalindrome(s2))
				{
					StringBuilder st1=new StringBuilder(s2);
					StringBuilder st2=st1.reverse();
					st=st.replace(start1, end1, st2.toString());
					start1=i+1;
					end1=start1;
					s2="";
				}
				else
				{
					s2="";
				}
			}
			else
			{
				s2=s2+s.charAt(i);
				end1++;
			}
		}
		//System.out.println(s2);
		if(!isPalindrome(s2))
		{
			StringBuilder st1=new StringBuilder(s2);
			StringBuilder st2=st1.reverse();
			st=st.replace(start1, end1, st2.toString());
			s2="";
		}
		System.out.println(st.toString());
	}

}
