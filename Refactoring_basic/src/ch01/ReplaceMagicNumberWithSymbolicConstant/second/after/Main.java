package ch01.ReplaceMagicNumberWithSymbolicConstant.second.after;


public class Main {
	
	public static void main (String[] args){
		Robot robot = new Robot("Andrew");
		robot.order(Robot.Command.WALK); //walk
		robot.order(Robot.Command.STOP); //stop
		robot.order(Robot.Command.JUMP); //jump
	}
}
