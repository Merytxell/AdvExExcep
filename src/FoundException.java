import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author AvilaC
 *
 */
public class FoundException {

	
	public static void main (String [] args) { 
			
		
		try { Date date = null;
		System.out.println(date);
		
		} catch (NullPointerException e) {
			
		}
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
	}
}
		
	



//La méthode getClass retourne un objet, instance d'une classe particulière appelée Class.
//Tout est objet en Java, y compris les classes elles-mêmes ! Il existe donc une classe Class, qui modélise les classes Java. 
//Si l'on veut juste le nom de la classe, il faut invoquer sa méthode getName().