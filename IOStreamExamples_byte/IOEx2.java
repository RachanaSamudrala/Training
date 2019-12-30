package IOStreamExamples_byte;

import java.io.*;

public class IOEx2 {

	public static void main(String[] args) throws Exception {
		
		long startTime = System.currentTimeMillis();
		IOEx2 ex2 = new IOEx2();
		ex2.execute();
		long endTime = System.currentTimeMillis();
		
		long executionTime = endTime - startTime;
		System.out.println("Program finished in "+executionTime+" millis");
		

	}

	public void execute() throws Exception
	{
			InputStream is = null;
			OutputStream os = null;
			try {
				
				File inputFile = new File("D:/abc.txt");
				is = new FileInputStream(inputFile);
				File outputFile = new File("D:/def.txt");
				os = new FileOutputStream(outputFile);
				//int read;
				
				int readBytesCount;
				byte[] buffer = new byte[1000];
				BufferedInputStream bis = new BufferedInputStream(is); 
				while((readBytesCount = is.read(buffer))>=0)
						{
							//System.out.println(read);
							os.write(buffer, 0, readBytesCount);
						}		
				System.out.println("DONE");
			    }
			catch (Exception e){
				e.printStackTrace();
			}
			finally {
				if(is!=null)
					is.close();
				if(os!=null)
					os.close();
			}
			
	}

}
