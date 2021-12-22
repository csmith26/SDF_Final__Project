import java.util.Scanner;
public class ProUpdate {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		boolean bool1;
		boolean boo;
		bool1 = true;
		boo = false;
		
		//yes = sn.nextBoolean();
		//no =  sn.nextBoolean();
		
		
		System.out.println("********** Profile Page **********");
		
		System.out.println("Name:");
		
		String name = sn.nextLine();
		
		System.out.println("Address:");
		String addr =sn.nextLine();
		
		System.out.println("Phone:");
		String phone =sn.nextLine();
		
		System.out.println("Email:");
		String mail =sn.nextLine();
		
		System.out.println("About me:");
		String me =sn.nextLine();
		
		
		System.out.println("This information provided is correct?:");
		boo = sn.nextBoolean();
		
			if (bool1) {
			 System.out.println("Your profile has sucessfully been created " );	 
			}	
			
			else{
				System.out.println("What information would you like to update:");
			}
	}			
}


