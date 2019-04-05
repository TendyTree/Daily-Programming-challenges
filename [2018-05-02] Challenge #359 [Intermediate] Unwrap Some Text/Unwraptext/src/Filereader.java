import java.util.Scanner;
import java.io.*;
public class Filereader{
	Filereader() {
		// TODO Auto-generated constructor stub
	}
	public void writeoutput(String path) throws Exception{
	try{
		PrintWriter writer = new PrintWriter("Output.txt");
		File file = new File(path);
		Scanner f = new Scanner(file);
		String newString;
		String currentString = "";
		int maxchar = 120;
		int character = 0;
		while(f.hasNextLine()){
			newString = f.nextLine();
			if(newString.charAt(newString.length()-1) != '.' && newString.charAt(newString.length()-1) != '!'){
				if(character < maxchar){
					if(newString.length() < (maxchar - character)){
						currentString += newString;
						character = currentString.length();
					}else{
						while(newString.charAt(maxchar - character) != ' '){
							character++;
						}
					writer.println(currentString + newString.substring(0,(maxchar-character)));
					currentString = newString.substring(maxchar-character+1, newString.length());
					character = currentString.length();
					}
					
				}
			}else{
				if(newString.length() <= (maxchar - character)){
					currentString += newString;
					writer.println(currentString);
					character = 0;
					currentString = "";
				}else{
					while(newString.charAt(maxchar - character) != ' ' && character != 119){
						character++;
					}
				writer.println(currentString + newString.substring(0,(maxchar-character)));
				writer.println(newString.substring(maxchar-character+1, newString.length()));
				character = 0;
				currentString = "";
				}
			}
		}
		writer.close();
		f.close();
	}
	catch(Exception e){
		throw new Exception(e);	
		}
	}
	


}
