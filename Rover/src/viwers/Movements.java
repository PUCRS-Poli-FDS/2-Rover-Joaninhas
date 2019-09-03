package viwers;

public class Movements {
	
	public int facing = 'N';	
	int x = 0;
	int y = 0;
	
	public int N = 1;
	public int E = 2;
	public int S = 3;
	public int W = 4;
	
	public void move(int letter) {
		if (facing == N) {
			this.y  ;
		} else if (facing == E) {
			this.x  ;
		} else if (facing == S) {
			this.y--;
		} else if (facing == W) {
			this.x--;
		}
	}
	public void turnLeft() {
		facing = (facing - 1) < N ? W : facing - 1;
	}
	public void turnRight() {
		facing = (facing   1) > W ? N : facing   1;

}
