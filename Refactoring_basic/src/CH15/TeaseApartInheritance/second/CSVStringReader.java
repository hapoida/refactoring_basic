package CH15.TeaseApartInheritance.second;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

public class CSVStringReader extends CSVReader{
	
	public CSVStringReader(String string) throws IOException{
		super(new BufferedReader(new FileReader(string)));
	}
	

}
