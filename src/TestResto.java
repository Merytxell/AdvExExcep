

public class TestResto {

	
	public static void main (String [] args){
		
		Menu starter = new Menu ("salade", "quiche", "soupe","aucun" );
		System.out.println("les entrées à la caete" + starter);
		
		Menu dish = new Menu ("poulet","boeuf","poisson","végan");
		System.out.println("les plats à la carte sont :" + dish);
		
		Menu sideDish = new Menu ("riz", "pâtes","frites","légumes");
		System.out.println("quel accompagnement choisissez-vous ?" + sideDish);
		
		Menu drinks = new Menu ("soda","eau plate", "eau gazeuse","vin");
		System.out.println("quelle boisson souhaitez vous prendre ?" + drinks);
		
		Menu dessert = new Menu ("tiramisu","mousse au chocolat","tarte maison","aucun");
		System.out.println("les desserts à la carte" + dessert);
		
}
	
	Thread client1 = new Thread(new Client("Client 1", menu));
    Thread client2 = new Thread(new Client("Client 2", menu));

	
}
