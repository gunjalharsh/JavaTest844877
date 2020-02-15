import java.util.Scanner;

public class StringCode1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

	Scanner str=new Scanner(System.in);
	System.out.println("Enter the String :");
	String input=str.nextLine();

		for(char i :input.toCharArray())
		{		
			
		if(input.indexOf(i)==input.lastIndexOf(i))
		{
			
		System.out.println(i);
		break;
		}
		}
		
	}

}
