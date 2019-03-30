/**
 * MesoSortedAbstract Class
 * 
 * @author johny
 * @version 3-30-19
 */
import java.util.HashMap;
import java.util.Map;

public abstract class MesoSortedAbstract
{
	/**
	 * Abstract Method sortedMap
	 * 
	 * @param unsorted
	 * @return Map<String, Integer>
	 */
	abstract Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted);
}
