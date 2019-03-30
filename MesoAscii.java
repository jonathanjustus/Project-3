
public class MesoAscii extends MesoAsciiAbstract
{
	private MesoStation mesoStation;
	
	public MesoAscii(MesoStation mesoStation)
	{	
		this.mesoStation = mesoStation;
	}
	
	public int calAverage()
	{	
		int intAvg = mesoStation.getStID().length();
		double asciiAdded = 0;
		String mesoID = mesoStation.getStID();
		
		for (int i = 0; i < mesoID.length(); ++i)
		{
			asciiAdded += mesoID.charAt(i);
		}
		
		double asciiAvg = asciiAdded / mesoID.length();
		
		int asciiCeiling = (int) Math.ceil(asciiAvg);
		int asciiFloor = (int) Math.floor(asciiAvg);
		
		if ((Math.abs(asciiAvg - asciiCeiling)) <= (Math.abs(asciiFloor - asciiAvg)))
		{
			intAvg = asciiCeiling;
		}
		else
		{
			intAvg = asciiFloor;
		}
		
		return intAvg;
	}
}
