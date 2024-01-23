
public class ExThread extends Thread {
	
	public ExThread (String name) {
		super(name);
		
	}

	public void run() {
		for (int i =0; i <5 ; i++) {
			
			System.out.print(this.getName());
			
		}
			
		System.out.println();
	}
	public static void main (String [] args) {
		
		ExThread t = new ExThread ("1-");
		ExThread t2 = new ExThread ("5-----");
		ExThread t3 = new ExThread ("2--");
		ExThread t4 = new ExThread ("3---");
		ExThread t5 = new ExThread ("4----");
		
		t.start();t2.start();t3.start();t4.start();t5.start();
		
		}
		
	}

