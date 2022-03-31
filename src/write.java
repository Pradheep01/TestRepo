import java.io.FileWriter;
import java.io.IOException;

public class write {
public static void main(String[] args) {
	try {
		FileWriter fwrite = new FileWriter("F:\\Fileopertaions.txt");	
	//write content in file operation
		fwrite.write("A named location used to store related information is refe9*rred to as a File.");
		
		//closing the stream
		fwrite.close();
		System.out.println("Content is successfully wrote to the file");
	} catch (IOException e) {
		// TODO: handle exception
		System.out.println("Unexpected error occurred");
	e.printStackTrace();
	}
}
}
