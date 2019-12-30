package IOStreamExamples_byte;
import java.io.*;


public class IobyteEx {
	
public static void main(String[] args)
{
	
		String path = "C:\\Users\\admin\\rachana\\abc.txt";
		File file = new File(path);
		System.out.println("is dir = "+file.isDirectory());
		System.out.println("is file = "+file.isFile());
		System.out.println("is hidden = "+file.isHidden());
		if(file.isDirectory())
		{
			String[] files = file.list();
			for(String f : files)
				System.out.println(f);
		}
		
		File dirToBeCreated = new File("C:\\Users\\admin\\Desktop\\NEW\\abc");
		boolean created = dirToBeCreated.mkdir();
		System.out.println("dir created = "+created);

}

}
