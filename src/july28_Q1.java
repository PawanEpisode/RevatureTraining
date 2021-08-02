import java.util.Scanner;
public class july28_Q1 {
	public static String extractDomainName(String url) {
	    int start = url.indexOf("://");
	    	    if (start < 0) {
	    	        start = 0;
	    	    } else {
	    	        start += 3;
	    	    }
	    	    int end = url.indexOf('/', start);
	    	    if (end < 0) {
	    	        end = url.length();
	    	    }
	    	    String domainName = url.substring(start, end);

	    	    int port = domainName.indexOf(':');
	    	    if (port >= 0) {
	    	        domainName = domainName.substring(0, port);
	    	    }
	    	    return domainName;
	    	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:- ");
		String st=sc.nextLine();
		System.out.println(extractDomainName(st));
		sc.close();
		

	}

}
