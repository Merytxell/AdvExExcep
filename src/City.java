
public class City {


		//atributs
		private String country;
		private String city;
		private int nbInhabitants;
		static int counter;

		public static final int Min_City_nbInhabitants = 0;

		//constructeur encapsulation forte
		public City (String city) {
			//setCountry(country);
			this.city = city;
			counter++ ;
			try {
				setNbInhabitants(nbInhabitants);
			} catch (PopulationException e) {
				
				e.printStackTrace();
			}
		}
		//ajout pour 1.3
		//public City()	{
			//this("unknown","unknown",0);
		//}

		//accesseur
		//getter

		public int getNbInhabitants (){
			return nbInhabitants;
		}
		public String getCountry() {
			return country;

		}
		public String getCity() {
			return city;
		}
		
		public String getMonument() {
			return  getMonument();
		}
		//setter
		public void setCountry(String country) {
			this.country = country;
		}

		public void setCity(String city) {
			this.city = city;

		}

		public void setNbInhabitants (int i) throws PopulationException {

			if (i < 0) {
				throw new PopulationException ("il est impossible qu'une ville dispose de moins de 0 habitants !");
			}else {
				this.nbInhabitants = i;
			}
		}
		/*
		 * public City (String country, String city, int nbInhabitants) { this.country=
		 * country; this.city=city; this.nbInhabitants= nbInhabitants;
		 */

		//methodes

		 public void display() { System.out.println("ville de " + this.city + " " + 
				  				"en " +this.country + " " + 											
				  				"ayant " + this.nbInhabitants + " " );
		 }
		@Override
		public String toString() {
			return "City [country=" + country + ", city=" + city + ", nbInhabitants=" + nbInhabitants + "]";
		}
		
			


}

