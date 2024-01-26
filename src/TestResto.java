import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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


		//faire fonctionner le constructeur
		Thread client1 = new Thread(new Client("Client 1",starter,dish,sideDish,drinks,dessert));
		Thread client2 = new Thread(new Client("Client 2", starter,dish,sideDish,drinks,dessert));
		//System.out.println(client1);

		client1.start();
		client2.start();

	}

	public class CreateFile {
		
		
		File file = new File("C:\\Users\\AvilaC\\eclipse-workspace\\AdvExExcep\\order.txt");

		if (!file.exists()) {
			try {

				file.createNewFile();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}else{
			FileWriter writer;
			try {
				writer = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(writer);
				bw.write("Hello");
				bw.newLine();
				bw.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
}

