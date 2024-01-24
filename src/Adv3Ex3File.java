public class Adv3Ex3File {

		
		public class Resto {
		

		
		public String starter;
		public String dish;
		public String dessert;
		
		
		public Resto ( String starter,String dish,String dessert) {
			
			this.starter=starter;
			this.dish=dish; 
			this.dessert=dessert;
		}
		
		 public void display() { System.out.println("voici le menu 1 : " + this.starter + " le menu 2 : " + 
	  				 this.dish + " et enfin le menu 3" + this.dessert);	}


			public String getStarter() {
				return starter;
			}


			public void setStarter(String starter) {
				this.starter = starter;
			}


			public String getDish() {
				return dish;
			}


			public void setDish(String dish) {
				this.dish = dish;
			}


			public String getDessert() {
				return dessert;
			}


			public void setDessert(String dessert) {
				this.dessert = dessert;
			}

	}
		
}