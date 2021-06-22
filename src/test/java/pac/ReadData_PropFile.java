package pac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadData_PropFile {

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		
		Properties prop= new Properties();
		prop.load(new FileInputStream("../SDET_17/CommonData.properties"));
		String value=prop.getProperty("Address");
		System.out.println(value);

	}

}
