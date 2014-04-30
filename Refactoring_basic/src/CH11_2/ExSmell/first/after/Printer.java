package CH11_2.ExSmell.first.after;

public abstract class Printer {
	public abstract void println(int n);
	
	public void execute(){
		int[] table = {3,1,4,1,5,9};
		for(int n : table){
			println(n);
		}
	}
}
