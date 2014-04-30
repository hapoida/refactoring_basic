package ch01.ReplaceMagicNumberWithSymbolicConstant.first.after;


public class Main {
	
	public static void main (String[] args){
		Robot robot = new Robot("Andrew");
		robot.order(robot.COMMAND_WALK); //walk
		robot.order(robot.COMMAND_STOP); //stop
		robot.order(robot.COMMAND_JUMP); //jump
	}
}
