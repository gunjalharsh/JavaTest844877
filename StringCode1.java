import java.util.Scanner;

public class StringCode1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

	Scanner str=new Scanner(System.in);
	System.out.println("Enter the String :");
	String input=str.nextLine();
	char[] ch =input.toCharArray();
	
	for(int i=0;i<ch.length;i++)
	{
		char c=input.charAt(i);
		if(input.indexOf(c)==input.lastIndexOf(c))
		{
			System.out.println(input.charAt(i));
			System.out.println("Index Location is :"+input.indexOf(c));
			break;
		}
		
	}
			
	}

}
