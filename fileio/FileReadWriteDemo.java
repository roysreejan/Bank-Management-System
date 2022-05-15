package fileio;

import java.lang.*;
import java.io.*;

public class FileReadWriteDemo
{
	private File file;				 
	private FileWriter writer;		 
	private FileReader reader;		 
	private BufferedReader bfr;		 
	
	
	public void writeInFile(String s)
	{  
		try
		{
			file = new File("History.txt");			 
			file.createNewFile();					 
			writer = new FileWriter(file, true);	 
			writer.write(s+"\r"+"\n");				 
			writer.flush();							 
			writer.close();							 
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void readFromFile()
	{ 
		try
		{
			reader = new FileReader(file);			 
			bfr = new BufferedReader(reader);		 
			String text="", temp;					 
			
			while((temp=bfr.readLine())!=null)		 
			{
				text=text+temp+"\n"+"\r";			 
			}
			
			System.out.print(text);   				 
			reader.close();							 
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
}