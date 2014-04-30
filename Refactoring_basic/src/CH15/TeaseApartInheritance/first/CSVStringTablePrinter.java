package CH15.TeaseApartInheritance.first;

import java.io.IOException;

public class CSVStringTablePrinter extends CSVPrinter{

	
	protected CSVStringTablePrinter(String string) {
		super(new CSVStringReader(string));
	}

	public void print() throws IOException{
		System.out.println("<table>");
		
		for (int row = 0; true; row++) {
			String[] item = readCSV();
			
			if(item == null){
				break;
			}
			System.out.println("<tr>");
			for (int column = 0; column < item.length; column++) {
				System.out.println("<td>");
				System.out.println(item[column]);
				System.out.println("</td>");
			}
			System.out.println("</tr>");
		}
		System.out.println("</table>");
	}

	@Override
	public String[] readCSV() throws IOException {
		return _csvReader.readCSV();
	}

}
