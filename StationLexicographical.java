/**
 * StationLexicographical Class (extends MesoSortedAbstract)
 * 
 * @author johny
 * @version 3-30-19
 */

/**
 * Import Statements
 */
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class StationLexicographical extends MesoSortedAbstract
{
	/**
	 * Instance Variable
	 */
	private HashMap<String, Integer> asciiValues;
	
	/**
	 * Constructor
	 * @param asciiValues
	 */
	public StationLexicographical(HashMap<String, Integer> asciiValues)
	{
		this.asciiValues = asciiValues;
		sortedMap(asciiValues);
	}
	
	/**
	 * sortedMap Method
	 * @param unsortedHashMap
	 * @return sortedMap
	 */
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
