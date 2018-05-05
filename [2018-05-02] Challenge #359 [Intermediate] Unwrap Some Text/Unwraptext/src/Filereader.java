import java.util.Scanner;
import java.io.*;
public class Filereader extends Paragraph {
	Filereader(int newLines, int newAvgchar) {
		super(newLines, newAvgchar);
		// TODO Auto-generated constructor stub
	}

	public  void read(String path) throws Exception{
		try{
			File file = new File(path);
			Scanner f = new Scanner(file);
			String newString = null;
			int line = 0;
			int character = 0;
			while(f.hasNextLine()){
				newString = f.nextLine();		
				if(newString.charAt(newString.length()) != '.' || newString.charAt(newString.length()) != '!'){
					line++;
					character += newString.length();
					}
				super.setChar(character);
				super.setLines(line);
				}
			}
		catch(Exception e){
		throw new Exception(e);	
		}
	}

	public void writeoutput(String path) throws Exception{
	try{
		PrintWriter writer = new PrintWriter("Output.txt", "UTF-8");
		File file = new File(path);
		Scanner f = new Scanner(file);
		String newString = null;
		int maxchar = 120;
		int line = 0;
		int character = 0;
		while(f.hasNextLine()){
			newString = f.nextLine();			
			if(newString.charAt(newString.length()) != '.' || newString.charAt(newString.length()) != '!'){
			}
		super.setChar(character);
		super.setLines(line);
		}
	}
	catch(Exception e){
		throw new Exception(e);	
		}
	}
	


}
