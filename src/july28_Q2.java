import java.util.Scanner;
public class july28_Q2 {
	public static void isWebSecure(String s)
	{
		boolean flag=false;
		if(s.startsWith("https"))
		{
			flag=true;
			System.out.println("Website Is Secure.");
		}
		if(s.startsWith("http") && flag==false)
			System.out.println("Website Is Not Secure");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		sc.close();
		isWebSecure(st);

	}

}
