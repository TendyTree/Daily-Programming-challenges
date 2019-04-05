import java.util.Scanner;

public class Unwraptext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner scan = new Scanner (System.in);
			String newString;
			System.out.println("please enter address:");
			newString = scan.nextLine();
			Filereader filereader = new Filereader();
			filereader.writeoutput(newString);
			System.out.println("exit");
		}
		catch(Exception e){
		System.out.println("There was an error");
		System.out.println(e.getMessage());
		e.printStackTrace();
		}

	}

}
