
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class TpResto {



	public static final String [] STARTER = 	{"entrée", "salade","soupe","quiche","aucune"};
	public static final String [] DISHES = 		{"plats" , "poulet" , "boeuf" , "poisson" , "végétarien" , "vegan","aucun"};
	public static final String [] SIDE_DISH = 	{"accompagnements" , "riz" , "pates" , "frites" , "légumes","aucun"};
	public static final String [] DRINKS = 		{"boissons" , "eau plate" , "eau gazeuze" , "soda" , "vin","aucune"};
	public static final String [] DESSERTS = 	{"desserts" , "tarte maison" , "mousse au chocolat" , "tiramisu","aucun"};

	public static void main(String[] args) throws IOException {		
		System.out.println("bonjour, combien de menus souhaitez vous ?");
		Scanner scan = new Scanner(System.in);
		int nbMenu;
		while(scan.hasNextInt() == false)	scan.next();
		nbMenu = scan.nextInt();
		ArrayList<String>  order = new ArrayList<String>();
		for(int i = 0 ; i < nbMenu ; i ++) {
			System.out.println("Commande numéro " + (i+1));
			System.out.println(order);
			int result = getInfos(scan,STARTER[0]);
			if(STARTER.length-1 > result)	order.add(STARTER[result]);

			result = getInfos(scan,DISHES[0]);
			if(DISHES.length-1 > result)	order.add(DISHES[result]);	

			result = getInfos(scan,SIDE_DISH[0]);
			if(SIDE_DISH.length-1 > result)	order.add(SIDE_DISH[result]);	

			result = getInfos(scan,DRINKS[0]);
			if(DRINKS.length-1 > result)	order.add(DRINKS[result]);

			result = getInfos(scan,DESSERTS[0]);
			if(DESSERTS.length-1 > result)	order.add(DESSERTS[result]);	

			System.out.println("Résumé de la commande "+(i+1));
			createFile(order, i+1);
			System.out.println(order);		//ici on pourrait stocker la commande en base par exemple
			System.out.println();			//avant de passer à la suivante
			order.clear();
		}	
		displayAllOrders();

		scan.close();
	}
	
	private static void createFile (ArrayList <String> order, int Oder) {
		String FileName = "ResultOrder.txt";

		try( BufferedWriter writer = new BufferedWriter (new FileWriter  (FileName, true))){
			int orderNbr =1;
			writer.write("**********Résumé de la commande "+ (++orderNbr) + " **********"+ "\n ");
			
			for (String item : order) {
				writer.write(item + " \n ");
			}
			writer.newLine();
			System.out.println("résumé de la commande" + order +" a bien été enregistré dans le récapitulatif des commandes");
		}catch(IOException e) {
			System.out.println("erreur system lors de l'enregistrement du récapitualtif");
			e.printStackTrace();
		}
	}
	private static void displayAllOrders() throws IOException {
		String fileName = "ResultOrder.txt";
		try (Scanner scan = new Scanner(fileName)) {
			//int orderNbr = 0;
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				//System.out.println("Commande" + (++orderNbr) + " " + "\n");
				//orderNbr++;//ne compte pas le nombre de commmande comme voulu --> à traiter              
			}
		}
		}
	public static int getInfos(Scanner scan, String info) {
		System.out.println("choix " + info + " : ");
		int maxChoice = 0;
		if(info.equalsIgnoreCase(STARTER[0]))	maxChoice = displayTable(STARTER);
		else if(info.equalsIgnoreCase(DISHES[0])) maxChoice = displayTable(DISHES);
		else if(info.equalsIgnoreCase(SIDE_DISH[0])) maxChoice = displayTable(SIDE_DISH);
		else if(info.equalsIgnoreCase(DRINKS[0])) maxChoice = displayTable(DRINKS);
		else if(info.equalsIgnoreCase(DESSERTS[0])) maxChoice =	displayTable(DESSERTS);		
		System.out.println("que souhaitez vous comme "+ info + " ? [saisir le chiffre correspondant]");

		int value = 0; 
		while(value < 1 || value > maxChoice) {				
			while(scan.hasNextInt() == false)	scan.next();	
			value = scan.nextInt();
			if(value < 1 || value > maxChoice)	System.out.println("mauvaise saisie !");
		}			
		return value; 
	}	

	public static int displayTable(String [] table) {
		for(int i=1;i<table.length;i++) {			
			System.out.print("[" + i + " - " + table[i].toUpperCase() + "]");
		}
		System.out.println();
		return table.length;
	}
}

//reprise de la correction de Mohammed car je ne l'avais pas fais
//reste à faire un meilleur affichage dans le fichier.txt - ok
//gérer la mise à jour des numéros de commande

