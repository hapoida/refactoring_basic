package CH11_2.ExSmell.first.after;

public class Client {
	
	public Client(boolean graphical){
		if(graphical){
			new GraphPrinter().execute();
		} else{
			new DigitPrinter().execute();
		}
			
	}
}
