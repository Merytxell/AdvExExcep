import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Menu {

	
	//création des menus
	public String plate1;
	public String plate2;
	public String plate3;
	public String plate4;
	private String chosenPlate;
	private Lock choiceLock = new ReentrantLock();
		
	
	
	public Menu (String plate1,String plate2,String plate3,String plate4) {
		this.plate1=plate1;
		this.plate2=plate2;
		this.plate3=plate3;
		this.plate4=plate4;
		
		
	}
	
	public void choosePlate(String plate) {
		try{
			chosenPlate = plate;
			System.out.println("vous avez choisi :" + chosenPlate);
			System.out.println("très bon choix");
		}finally {
			choiceLock.unlock();
			
		}
	}
	
	public String getChosenPlate() {
		return chosenPlate;
		
	}
	
		
 public String toString() {
	 return " est composé de : " + this.plate1 + " , " +  this.plate2 + " , " +  this.plate3 + " , " 
			 + this.plate4 + " , " + "quel est votre choix ?" ;
 }

	public String getPlate1() {
		return plate1;
	}


	public void setPlate1(String plate1) {
		this.plate1 = plate1;
	}


	public String getPlate2() {
		return plate2;
	}


	public void setPlate2(String plate2) {
		this.plate2 = plate2;
	}


	public String getPlate3() {
		return plate3;
	}


	public void setPlate3(String plate3) {
		this.plate3 = plate3;
	}


	public String getPlate4() {
		return plate4;
	}


	public void setPlate4(String plate4) {
		this.plate4 = plate4;
	}
}
