import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class ThreadTime extends Thread{

  public static void main(String[] args) {
	  
	 
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	 
   
    	while(true) {
    		LocalTime df= LocalTime.now();
    		String timeFormat = df.format(formatter);
    		System.out.printf(timeFormat + "\t");
    		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	       //System.out.println("-");
    	}
    }
  }
