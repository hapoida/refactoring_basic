package CH15.TeaseApartInheritance.first;

import java.io.IOException;

public class CSVFileTreePrinter extends CSVPrinter{

	public CSVFileTreePrinter(String filename) throws IOException {
		super(new CSVFileReader(filename));
	}
	
	public void print() throws IOException{
		String[] prevItem = new String[0];
		
		for (int row = 0; true; row++) {
			String[] item = readCSV();
			
			if(item == null){
				break;
			}
			boolean justprint = false;
			for (int column = 0; column < item.length; column++) {
				if(justprint){
					print_line(column, item[column]);
				} else {
					if(prevItem.length <= column || !item[column].equals(prevItem[column])){
						print_line(column, item[column]);
						justprint = true;
					}
				}
			}
			
		}
	}

	private void print_line(int indent, String string) {
		for (int i = 0; i < indent; i++) {
			System.out.print("	");
		}
		System.out.println(string);
	}

	@Override
	public String[] readCSV() throws IOException {
		return _csvReader.readCSV();
	}

}
