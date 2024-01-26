import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collector;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class TestResto extends Thread {


	public static void main (String [] args){

		Menu starter = new Menu ("salade", "quiche", "soupe","aucun" );
		//System.out.println("les entrées à la carte" + starter);

		Menu dish = new Menu ("poulet","boeuf","poisson","végan");
		//System.out.println("les plats à la carte sont :" + dish);

		Menu sideDish = new Menu ("riz", "pâtes","frites","légumes");
		//System.out.println("quel accompagnement choisissez-vous ?" + sideDish);

		Menu drinks = new Menu ("soda","eau plate", "eau gazeuse","vin");
		//System.out.println("quelle boisson souhaitez vous prendre ?" + drinks);

		Menu dessert = new Menu ("tiramisu","mousse au chocolat","tarte maison","aucun");
		//System.out.println("les desserts à la carte" + dessert);

		ResultMenu resultMenu = new ResultMenu ();

		//faire fonctionner le constructeur + ajouter le résultat des menus
		Thread client1 = new Thread(new Client("Client 1",starter,dish,sideDish,drinks,dessert, resultMenu));
		Thread client2 = new Thread(new Client("Client 2", starter,dish,sideDish,drinks,dessert, resultMenu));
		//System.out.println(client1);

		client1.start();
		client2.start();

	
	try {
	//join sert à attendre ue les threads se terminent
		client1.join();
		client2.join();
	}catch (Exception e) {
		e.printStackTrace();
	}

	//récupérer les choix des clients en appelant la méthode Createfile
	CreateFile(resultMenu.getResultMenu(),"order.txt");

	//on doit écrire les résultats affiché en console ici "en forme de liste"
	private static void  CreateFile (List <String> collect, String FileName ){

		File file = new File(FileName);
		//File file = new File("C:\\Users\\AvilaC\\eclipse-workspace\\AdvExExcep\\order.txt");

		//pas utile c'est le seul que j'ai crééé 
		//if (!file.exists()) {

		try 
		(FileWriter writer = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(writer)){

			for (String collects : collect) {
				bw.write(collects);
				bw.newLine();
				bw.close();
				writer.close();
			}
		} catch(IOException e) {
			e.printStackTrace();

			//file.createNewFile();


			//FileWriter writer;
			//try {
			//writer = new FileWriter(file);


		}

	}
}
