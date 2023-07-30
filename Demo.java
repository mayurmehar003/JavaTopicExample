package day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class Demo
{
public static void findfile() throws IOException
{
	File file=new File("mayur.txt");
	FileInputStream f1=new FileInputStream(file);
}

public static void main(String[] args)
{
	try {
	findfile();
	}
	catch(IOException e)
	{
		System.out.println("handled");
	}

}

}