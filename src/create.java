import java.io.File;
import java.io.IOException;

public class create {
public static void main(String[] args) {
	try {
	File create = new File("F:\\Fileopertaions.txt");
if(create.createNewFile())
{
	System.out.println("File" + create.getName());
	}
else {
	System.out.println("File exists");
}
	}
catch (IOException e) {
	// TODO: handle exception
System.out.println("Error occurred");
e.printStackTrace();
}
}

}
