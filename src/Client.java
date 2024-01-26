public class Client implements Runnable {
	//super(name); il était déjà en dessous
	private String name;
	private Menu menu;

	public Client (String name, Menu menu, Menu dish, Menu sideDish, Menu drinks, Menu dessert) {
		this.name=name;
		this.menu=menu;
	
		
	}
	@Override
	public void run() {
		try {
			//System.out.println();
			choiseClient();//déterminer comment le client va faire son choix
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	public synchronized void choiseClient() throws InterruptedException{
		
		
		//System.out.println("choix du client " + this.name);
		//vitesse à laaquelle le client choisi son plat 
		Thread.sleep(1000);
		
		//gestion des menus
		String[] plates = {"salade", "quiche", "soupe","aucun" };
		String [] plateDish = {"poulet","boeuf","poisson","végan"};
		String [] plateSideDish = {"riz", "pâtes","frites","légumes"};
		String [] plateDrinks = {"soda","eau plate", "eau gazeuse","vin"};
		String [] plateDesserts = {"tiramisu","mousse au chocolat","tarte maison","aucun"};
		
		String randomPlate = plates[(int) (Math.random()*plates.length)];
		String randomPlateDish = plateDish[(int) (Math.random()*plateDish.length)];
		String randomPlateSideDish = plateSideDish[(int) (Math.random()*plateSideDish.length)];
		String randomPlateDrinks = plateDrinks[(int) (Math.random()*plateDrinks.length)];
		String randomPlateDessert = plateDesserts[(int) (Math.random()*plateDesserts.length)];
		
		System.out.println(this.name + " a choisi :" + menu.getChosenPlate());
		
		try {
		menu.choosePlate(randomPlate);
		menu.choosePlate(randomPlateDish);
		menu.choosePlate(randomPlateSideDish);
		menu.choosePlate(randomPlateDrinks);
		menu.choosePlate(randomPlateDessert);
	
		}catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	
	/*
	 * @Override public String toString() { return "Client [name=" + name +
	 * ", menu=" + menu + "]"; }
	 */
}
/*
 * public String getName() { return name; } public void setName(String name) {
 * this.name = name; } public Menu getMenu() { return menu; } public void
 * setMenu(Menu menu) { this.menu = menu; }
 * 
 * }
 */




