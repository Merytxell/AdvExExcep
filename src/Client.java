import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client implements Runnable {
	//super(name); il était déjà en dessous
	private String name;
	private Menu menu;
	private Lock lock;



	public Client (String name, Menu menu) {
		this.name=name;
		this.menu=menu;
		//Verrou / sert à ce que les clients ne fasse pas comme pedro et sancho
		this.lock = new ReentrantLock();

	}
	@Override
	public void run() {
		try {
			choiseClient();//déterminer comment le client va faire son choix
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	private void choiseClient() throws InterruptedException{
		
		//vitesse à laaquelle le client choisi son plat 
		Thread.sleep(1000);
		
		//gestion des entrées
		String[] plates = {"salade", "quiche", "soupe","aucun" };
		String randomPlate = plates[(int) (Math.random()*plates.length)];
		
		lock.lock();
		
		try {
		menu.choosePlate(randomPlate);
	}finally {
	lock.unlock();
	
	}
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public Lock getLock() {
		return lock;
	}
	public void setLock(Lock lock) {
		this.lock = lock;
	}

}


