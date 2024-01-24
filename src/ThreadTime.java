
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class ThreadTime extends Thread{

  public static void main(String[] args) {
	  
	 
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	
 
   
    	while(true) {
    		LocalTime df= LocalTime.now();
    		String timeFormat = df.format(formatter);
    		System.out.println(timeFormat);
    		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	       //System.out.println("-");
    	}
    }
  }
