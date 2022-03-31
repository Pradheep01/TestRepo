import java.io.File;

public class getfileinfo {

public static void main(String[] args) {
	File create = new File("F:\\Fileopertaions.txt");
	if (create.exists()) {
		
		//file name
		System.out.println("Name of the file :" +create.getName());
		//file path
		System.out.println("File path :" +create.getAbsolutePath());
		//check file is writable
		System.out.println("is writable :" +create.canWrite());
		//check file is readable
		System.out.println("is readable :" +create.canRead());
		//check length
		System.out.println("length of the file :" +create.length());
	}
	else {
		System.out.println("File not exist");
	}
}
}

