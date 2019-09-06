package viwers;

import Class.Rover;

public class viwer extends Rover{
	public static void main(String args[]) {
		
		Rover rover = new Rover();
		rover.setPosition(1, 2, N);
		rover.process("LMLMLMLMM");
		rover.printPosition(); // prints 1 3 N
		rover.setPosition(3, 3, E);
		rover.process("MMRMMRMRRM");
		rover.printPosition(); // prints 5 1 E
		
	}

}
