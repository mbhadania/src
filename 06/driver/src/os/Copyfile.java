import java.io.*;

public class Copyfile                                              // Class for copying contents of Add.asm to Add.hack file
{
	public static void main(String args[])throws IOException
 {
 	String Filename= null;
	do{
	System.out.println("Enter the file name: ");
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	try
	{
	  Filename = bf.readLine();
	}catch (IOException e)
	{
		System.out.println("Error reading file");
	}

	if(Filename.endsWith((".asm")))
	{
	  try{

	  File F= new File("C:\\Users\\miten\\Documents\\GitHub\\src\\06\\add\\"+Filename);

	  if(F.exists())
	  {
	  	InputStream in= new FileInputStream(F);
	  	File O= new File("C:/Users/cse5343/src/06/add/Add.hack");
        OutputStream out= new FileOutputStream(O);                     // Preparing file Add.hack for writing
	    int size= in.available();                                      // available is used for calculating number of bytes that can be read

	    for(int i=0; i< size; i++)
	   {
         out.write(in.read());                                        // write contents of add.asm to add.hack
	   }
	   in.close();	                // Preparing file Add.asm for reading
	  }

	  else
	  {
	  	System.out.println("File does not exists");
	  }
	  }catch(IOException e)
	  {
	  	e.printStackTrace();
	  }
	}
	else
	{
		System.out.println("Please enter the name properly!!(For example ABC.asm)");
	}
	}while(!Filename.endsWith((".asm")));
 }
}