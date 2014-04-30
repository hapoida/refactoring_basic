package CH14.HideDelegate.first.after;

import java.util.Enumeration;

public class Main {
	public static void main(String[] args){
		try {
			AddressFile file = new AddressFile("address.pp");
			file.set("Hiroshi Yuki", "hyuki@example.com");
			file.set("Tmoura", "tomura@example.com");
			file.set("Hanako Sato", "hanako@example.com");
			file.update();
			
			Enumeration e = file.keys();
			while (e.hasMoreElements()) {
				String name = (String) e.nextElement();
				String mail = file.get(name);
				System.out.println("name=" + name + ", mail=" + mail);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
