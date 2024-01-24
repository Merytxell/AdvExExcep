public class Adv3Ex3File {

		
		public class Resto {
		

		public int menu;
		public String starter;
		public String dish;
		public String dessert;
		
		
		public Resto (int menu, String starter,String dish,String dessert) {
			this.menu= menu;
			this.starter=starter;
			this.dish=dish; 
			this.dessert=dessert;
		}

		public int getMenu() {
				return menu;
			}


			public void setMenu(int menu) {
				this.menu = menu;
			}


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