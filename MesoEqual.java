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
		
		int i = 0;
		int theStation = new MesoAscii(new MesoStation(stID)).calAverage();
		
		while (i < 119)
		{
			String compareStation = keyboard.next();
			MesoAscii compareMesoAscii = new MesoAscii(new MesoStation(compareStation));
			int compareAsciiValues = compareMesoAscii.calAverage();
				
			if (compareAsciiValues == theStation)
			{
				asciiValues.put(compareStation, compareAsciiValues);
			}
			
			keyboard.nextLine();
			++i;
		}
		
		Mesonet.close();
		keyboard.close();
		
		return asciiValues;
	}
}
