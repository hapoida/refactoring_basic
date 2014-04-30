package ch02_2.SimpleDatabase.third.after;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleDatabase {
	private Map<String, String> _map = new HashMap<String, String>();
	private static Pattern _pattern  = Pattern.compile("([^=]+)=(.*)") ;
	
	public SimpleDatabase(Reader r1) throws IOException{
		BufferedReader r2 = new BufferedReader(r1);
		
		while (true) {
			String line = r2.readLine();
			if(line == null){
				break;
			}
			
			Matcher matcher = _pattern.matcher(line);
			if(matcher.matches()){
				String key   = matcher.group(1);
				String value = matcher.group(2);
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
