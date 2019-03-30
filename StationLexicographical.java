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
		SortedMap<String, Integer> sortedMap = new TreeMap<String, Integer>();
		
		for (String stationID : asciiValues.keySet())
		{
			sortedMap.put(stationID, asciiValues.get(stationID));
		}
		
		for (String stationID : sortedMap.keySet())
		{
			System.out.println(stationID + " " + sortedMap.get(stationID));
		}
		
		return sortedMap;
	}
}
