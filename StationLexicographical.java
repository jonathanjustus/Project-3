import java.util.HashMap;

public class StationLexicographical extends MesoSortedAbstract
{
	private HashMap<String, Integer> asciiValues;
	
	public StationLexicographical(HashMap<String, Integer> asciiValues)
	{
		this.asciiValues = asciiValues;
		sortedMap(asciiValues);
	}
	
}
