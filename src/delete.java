import java.io.File;

public class delete {
public static void main(String[] args) {
	File Delete = new File("F:\\Fileopertaions.txt");
	if (Delete.delete()) {
		System.out.println(Delete.getName() + "File deleted");
	}else {
		System.out.println("Unexpected error found in deletion of the file");
	}
}
}
