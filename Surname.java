
import java.util.Scanner;
public class Surname
{

	public static void main(String[] args)
	{
			Scanner str=new Scanner(System.in);
	        System.out.print("Enter the String: ");
	        String s1=str.nextLine();
	        String name[] = s1.split(" ");
        
        
		        if(name.length>2)
		        	System.out.println(name[2]+" "+name[0].charAt(0) + "."+name[1].charAt(0));
		        else
		         System.out.println(name[1]+" "+name[0].charAt(0)+".");
		        
	}

}
