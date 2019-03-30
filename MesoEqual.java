import java.io.IOException;
import java.util.HashMap;

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
		
		return asciiValues;
	}
}
