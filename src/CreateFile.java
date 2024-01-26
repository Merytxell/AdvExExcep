import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main (String [] args) { 
		
		
	
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