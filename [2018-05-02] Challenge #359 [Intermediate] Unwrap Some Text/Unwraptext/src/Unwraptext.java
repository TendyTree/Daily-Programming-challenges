import java.util.Scanner;

public class Unwraptext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner scan = new Scanner (System.in);
			String newString;
			System.out.println("please enter address:This program does not work");
			newString = scan.nextLine();
			Filereader filereader = new Filereader(0,0);
			filereader.read(newString);
			
		}
		catch(Exception e){
		System.out.println("There was an error");
		System.out.println(e.getMessage());
		e.printStackTrace();
		}

	}

}
