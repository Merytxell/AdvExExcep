
public class TestExceptionPopulation {

	public static void main (String [] args){
		
		City toulouse = new City ("toulouse");
		
				toulouse.setCity ("Toulouse");
				try {
					toulouse.setNbInhabitants(-200);
				} catch (PopulationException e) {
					
					e.printStackTrace();
				}
		
	}
}
