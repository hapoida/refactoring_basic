package ch02_2.SimpleDatabase.third.after;

import java.io.FileReader;
import java.util.Iterator;

public class Main {
	public static void main(String[] args){
		try {
			SimpleDatabase db = new SimpleDatabase(new FileReader("D:/41.code-refactoring-basic/CH2_SimpleDatabase/src/dbfile.txt"));
			Iterator<String> it = db.iterator();
			while (it.hasNext()) {				
				String key = it.next();
				System.out.println("KEY: \"" + key + "\"");
				System.out.println("VALUE: \"" + db.getValue(key) + "\"");
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
