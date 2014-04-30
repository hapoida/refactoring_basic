package ch02_2.SimpleDatabase.second.after;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabase {
	private Map<String, String> _map = new HashMap<String, String>();
	public SimpleDatabase(Reader r1) throws IOException{
		BufferedReader r2 = new BufferedReader(r1);
		
		while (true) {
			String line = r2.readLine();
			if(line == null){
				break;
			}
			
			int equalIndex = line.indexOf("=");
			if(equalIndex > 0){
				String key   = line.substring(0, equalIndex);
				String value = line.substring(equalIndex + 1, line.length());
				_map.put(key, value);
			}
		}
	}
	
	public void putValue(String key, String value){
		_map.put(key, value);
	}
	
	public String getValue(String key){
		return _map.get(key);
	}
	
	public Iterator<String> iterator(){
		return _map.keySet().iterator();
	}
}
