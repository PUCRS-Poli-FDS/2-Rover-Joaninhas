package viwers;

import Class.Rover;

public class viwer extends Rover{
	public static void main(String args[]) {
		
		Rover rover = new Rover();
		rover.setPosition(1, 2, N);
		rover.process("LMLMLMLMM");
		rover.printPosition(); // print 1 3 N
		rover.setPosition(3, 3, E);
		rover.process("MMRMMRMRRM");
		rover.printPosition(); // print 5 1 E
		
	}

}
