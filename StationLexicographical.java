import java.util.HashMap;
import java.util.Map;

public class StationLexicographical extends MesoSortedAbstract
{
	private HashMap<String, Integer> asciiValues;
	
	public StationLexicographical(HashMap<String, Integer> asciiValues)
	{
		this.asciiValues = asciiValues;
		sortedMap(asciiValues);
	}
	
	public Map<String, Integer> sortedMap(HashMap<String, Integer> unsortedHashMap)
	{
		
		return sortedMap;
	}
}
