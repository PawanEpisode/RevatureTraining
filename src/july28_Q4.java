import java.util.Scanner;
public class july28_Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Base Value :-");
		int a=sc.nextInt();
		System.out.println("Enter the Perpendicular Value :-");
		int b=sc.nextInt();
		double c= Math.sqrt(a*a + b*b);
		System.out.println("The Hypotenuse of Right Angled Traingle :- "+ c);

	}

}
