package CH14.HideDelegate.first.after;

import java.io.IOException;
import java.util.Enumeration;

public class AddressFile {
	private final Database _database;
	
	public AddressFile(String filename){
		_database = new Database(filename);
	}
	
	public Database getDatabase(){
		return _database;
	}
	
	public Enumeration keys(){
		return _database.keys();
	}
	
	public void set(String key, String value){
		_database.set(key, value);
	}
	
	public String get(String key){
		return _database.get(key);
	}
	
	public void update() throws IOException{
		_database.update();
	}
}
