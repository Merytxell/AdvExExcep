
public class TestRunnable implements Runnable {


	@Override
	public void run() {

		for (int i = 0; i < 10 ; i++) {
			char c = (char) ('\u0020' + i) ;
			
	
				System.out.print(c);
		
				for (int j = 1; j < i + 2 ; j++) {
					
					System.out.print("*");

				}
					
					System.out.print(c);
				

				System.out.println();
			}

		}

		public static void main (String [] args) {


			// Créer un objet Thread avec l'instance testRunnable
			Thread thread = new Thread(new TestRunnable());

			// Démarrer le thread
			thread.start();
		}
	}


	//System.out.println("\u0040");

	//System.out.println("\0021");







