package CH10.ReplaceErrorCodeWithExcption.first.after;

public class InvalidCommandException extends Exception{
	public InvalidCommandException(String name){
		super(name);
	}
	
	public InvalidCommandException(){
		
	}
}
