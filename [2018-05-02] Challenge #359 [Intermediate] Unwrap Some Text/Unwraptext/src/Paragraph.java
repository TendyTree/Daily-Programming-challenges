
public class Paragraph {
	private int lines = 0;
	private int character = 0;
	private int avgchar = 0;
	Paragraph(int newLines, int newAvgchar){
		lines = newLines;
		avgchar = newAvgchar;
	}
	public int getAvgchar(){
		avgchar = character/lines;
		return avgchar;
	}
	public void setChar(int newcharacter){
		character += newcharacter;
	}
	public void setLines(int newlines){
		lines += newlines;
	}

}
