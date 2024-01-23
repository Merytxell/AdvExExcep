
public class ExThread extends Thread {
	
	public ExThread (String name) {
		super(name);
		
	}

	public void run() {
		for (int i =0; i <20 ; i++) 
		System.out.println(this.getName());
	}
	public static void main (String [] args) {
		
		ExThread t = new ExThread ("-1-");
		ExThread t2 = new ExThread ("5-----");ExThread t3 = new ExThread ("2--");
		ExThread t4 = new ExThread ("3---");
		
		t.start();t2.start();t3.start();t4.start();
		
		
		
		}
		
	}

