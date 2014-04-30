package CH15.TeaseApartInheritance.first;

import java.io.IOException;

public class Main {
	private static final String SAMPLE_CSV_STRING = 
			"������ħ,Good morning. \n" +
			"�ȳ��ϼ���,Hello. \n" +
			"��������,Good evening. \n" +
			"������,Good night. \n"
			;
	
	private static final String SAMPLE_CSV_FILE = "file.csv";
	
	public static void main(String[] args) throws IOException{
		new CSVStringTablePrinter(SAMPLE_CSV_STRING).print();
		new CSVFileTreePrinter(SAMPLE_CSV_FILE).print();
	}
}
