import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Handling {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("Hello.txt");
		String text="Hello, User";
		FileOutputStream fos=new FileOutputStream(file);
		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.writeUTF(text);
		
		FileInputStream fis=new FileInputStream(file);
		DataInputStream dis=new DataInputStream(fis);
		
		String str=dis.readUTF();
		
		System.out.println(str);
		
		
	}

}
