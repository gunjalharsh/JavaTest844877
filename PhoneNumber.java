import java.util.HashMap;
import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		Scanner str=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);

		HashMap<String,String> data =new HashMap<String,String>();
	
		System.out.println("Enter the Values :");
		int n = sc.nextInt();
		
		
		for(int i=0;i<n;i++)
		{
			
			System.out.println("Enter the name :");
			String s1=str.next();
			System.out.println("Enter the number :");
			String n1=sc.next();
			
			if(n1.length()==10)
			{
				data.put(s1,n1);
				System.out.println(data);
				 
			}
			else { System.out.println("Please enter the number again :");
			String n2=sc.next();
			data.put(s1,n2);
			}
		    }
	 
			System.out.println("Enter number for finding Phone Number :");
					
				
					int n2=sc.nextInt();
		
					for(int i=0;i<n2;i++) 
					{
						System.out.println("Enter the name to search : ");
						String s3 = str.next();
				
					
						if(data.containsKey(s3))
						{
						System.out.println("Phone Number is : "+data.get(s3));
						}
						else System.out.println("Entry not Exist");
						
						}
			}
			}

