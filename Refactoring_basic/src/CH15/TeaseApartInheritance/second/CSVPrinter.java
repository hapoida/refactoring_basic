package CH15.TeaseApartInheritance.second;

import java.io.IOException;

public abstract class CSVPrinter {
	protected final CSVReader _csvReader;
	protected CSVPrinter(CSVReader csvReader){
		_csvReader = csvReader;
	}
	public abstract String[] readCSV() throws IOException;
	public abstract void print() throws IOException;
}
