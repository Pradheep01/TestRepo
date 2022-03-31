import java.io.File;
import java.util.Scanner;

public class Read {
public static void main(String[] args) {
	try {
		File read = new File("F:\\Fileopertaions.txt");
		Scanner datareader = new Scanner(read);
		while (datareader.hasNextLine()) {
			String filedata = datareader.nextLine();
			System.out.println(filedata);
		}
		datareader.close();
	} catch (Exception e) {
		// TODO: handle exception
	System.out.println("Unexcpected error occurred");
	e.printStackTrace();
	}
}
}
