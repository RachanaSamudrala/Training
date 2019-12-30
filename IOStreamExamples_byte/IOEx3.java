package IOStreamExamples_byte;
import java.io.*;

public class IOEx3 {

	public static void main(String[] args) throws Exception {
		
		IOEx3 ex3 = new IOEx3();
		ex3.execute();
		
	}
	
	public void execute() throws Exception
	{
		InputStream is = null;
		OutputStream os = null;
		try {
			is = System.in;
			os = System.out;
			int read;
			while((read = is.read()) >=0 )
			//int readBytesCount;
			//byte[] buffer = new byte[1000];
			//while((readBytesCount = is.read(buffer))>=0)
					{
						//System.out.println(read);
						//os.write(buffer, 0, readBytesCount);
						os.write(read);
					}	
			System.out.println("DONE");
		    }
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			if(is!=null)
			{
				is.close();
			}
			if(os!=null)
			{
				os.close();
			}
		}
		
}


	}
