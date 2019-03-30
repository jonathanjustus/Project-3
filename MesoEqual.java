import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class MesoEqual
{
	private String stID;
	private HashMap<String, Integer> asciiValues;
	
	public MesoEqual(String stID)
	{
		this.stID = stID;
		asciiValues = new HashMap<String, Integer>();
	}
	
	public HashMap<String, Integer> calAsciiEqual() throws IOException
	{

		FileInputStream Mesonet = new FileInputStream("Mesonet.txt");
		Scanner keyboard = new Scanner(Mesonet);
		
		keyboard.nextLine();
		keyboard.nextLine();
		keyboard.nextLine();
		
		return asciiValues;
	}
}
