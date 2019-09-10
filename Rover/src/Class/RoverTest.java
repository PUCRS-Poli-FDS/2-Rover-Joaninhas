package Class;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RoverTest {

	Rover rover;
	public final int N = 1;
	public final int E = 2;
	public final int S = 3;
	public final int W = 4;

	@BeforeEach
	public void Setup() {
		rover = new Rover();
	}

	@Test
	void test() {
		String answer = "1 2 N";
		rover.setPosition(1, 2, N);
		System.out.println(rover.printPosition());
		assertEquals(answer, rover.printPosition());
	}

}
