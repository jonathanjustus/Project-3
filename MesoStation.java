/**
 * MesoStation Class
 * 
 * @author johny
 * @version 3-30-19
 */
public class MesoStation 
{
	/**
	 * Instance Variable
	 */
	private String StID;
	
	/**
	 * Constructor
	 * @param String StID
	 */
	public MesoStation(String StID)
	{
		this.StID = StID;
	}
	
	/**
	 * GetStID Method
	 * @return StID
	 */
	public String getStID()
	{
		return StID;
	}
}