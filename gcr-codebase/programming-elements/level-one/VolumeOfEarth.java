//Calculating Volume of earth
public class VolumeOfEarth{
	public static void main(String[]args)
	{   //Giving input
		double radiusInKm=6378;
		double radiusInMiles= radiusInKm/1.6;
		
		//Calculating volume
		double volumeInCubicKilometers=(4/3.0)*(Math.PI)*(radiusInKm*radiusInKm*radiusInKm);
		double volumeInCubicMiles=(4/3.0)*(Math.PI)*(radiusInMiles*radiusInMiles*radiusInMiles);
		
		//Printing volume
		System.out.println("The volume of earth in cubic kilometers is "+volumeInCubicKilometers+" and cubic miles is "+volumeInCubicMiles);
	}
}