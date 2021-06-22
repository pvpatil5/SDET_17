package pac;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadFromJSON {

public static void main(String[] args) throws IOException, ParseException {
	
	//File Path
	
	FileReader inputfile = new FileReader("../SDET_17/CommonData1.json");
	
	//Parse the json object into java data stream
	
	JSONParser parser = new JSONParser();
	
	Object obj = parser.parse(inputfile);
	
	// type cast the object into hashmap and read data in key and value format
	HashMap jobj= (HashMap) obj;
	
	String value=jobj.get("Name").toString();
	
	System.out.println(value);
	
	
	
	
	
	
	
	
	
}

}
