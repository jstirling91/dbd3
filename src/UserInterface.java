import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
	
	 static Scanner scanner;
	
	public static void main(String args[]) throws InterruptedException{
		while(true){
			scanner = new Scanner(new InputStreamReader(System.in));
			System.out.println("Please Select one of the following options:");
			System.out.println("\t1. Get Locations and their ratings");
			System.out.println("\t2. Get the sports played at locations with two reviews");
			System.out.println("\t3. Get the user names who have atleast two reviews,");
			System.out.println("\t   but having more user reviews then location reviews");
			System.out.println("\t4. Find users who play either the slected sports but nor both");
	//		TODO: Find out what the query does and insert here
			System.out.println("\t5. TODO");
			System.out.print("Input your option: ");
			try{
				int option = scanner.nextInt();
				switch(option){
					case 1: System.out.println("HERE");
							option1();
							break;
					case 2: System.out.println("2 selected");
							break;
					case 3: System.out.println("3 selected");
							break;
					case 4: System.out.println("4 selected");
							break;
					case 5: System.out.println("5 selected");
							break;
					default: System.out.println("Error: Plaese select a number between 1 and 5"); 
							 break;
				}
			} catch(InputMismatchException e){
				System.out.println("\nError: Please insert a number\n");
			}
			Thread.sleep(1000);
		}
	}
	
	public static void option1(){
		database.option1();
	}
}

