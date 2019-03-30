/**
 * Main Class
 * 
 * @author johny
 * @version 3-30-19
 */
import java.io.IOException;
import java.util.HashMap;

public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		String StID = "FAIR";
		MesoAscii AsciiAverage = new MesoAscii(new MesoStation(StID));
		int AsciiAvg = AsciiAverage.calAverage();
		
		HashMap<String, Integer> AsciiValues = new HashMap<String, Integer>();
		AsciiValues.put(StID, AsciiAvg);
		System.out.print("ASCII average: ");
		System.out.println(AsciiValues.get(StID));
		
		MesoEqual mesoequal = new MesoEqual(StID);
		System.out.println("Stations are: "+ mesoequal.calAsciiEqual());
		
		System.out.print("##");
		System.out.println("Unsroted:");
		AsciiValues = mesoequal.calAsciiEqual();
		
		for (String stid : AsciiValues.keySet()) 
		{
		    System.out.println(stid + " " + AsciiValues.get(stid));		    
		}
		
		System.out.print("##");
		System.out.println("Sorted:");
		new StationLexicographical(AsciiValues);	  
	}
}
