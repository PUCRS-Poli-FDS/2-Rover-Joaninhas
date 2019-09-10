package Class;

public class Rover {
	
    	public static final int N = 1;
    	public static final int E = 2;
    	public static final int S = 3;
    	public static final int W = 4;
    	
    	int x = 0;
    	int y = 0;
    	int coordinate = N;
    	
    	public Rover() {
    		
    	}
    	
    	public void setPosition(int x, int y, int coordinate) {
    		this.x = x;
    		this.y = y;    		
    		this.coordinate = coordinate;
    	}
    	
    	public void printPosition() {
    		char dir = 'N';
    		if (coordinate == 1) {
    			dir = 'N';
    		} else if (coordinate == 2) {
    			dir = 'E';
    		} else if (coordinate == 3) {
    			dir = 'S';
    		} else if (coordinate == 4) {
    			dir = 'W';
    		}
    		System.out.println(x + " " + y + " " + dir);
    	}
    	
    	public void process(String commands) {
    		for (int idx = 0; idx < commands.length(); idx++) {
    			process(commands.charAt(idx));
    		}
    	}
    	
    	private void process(Character command) {
    		if (command.equals('L')) {
    			turnLeft();
    		} else if (command.equals('R')) {
    			turnRight();
    		} else if (command.equals('M')) {
    			move();
    		} else {
    			throw new IllegalArgumentException(
    					"Please enter only L, R or M letters!");
    		}
    	}
    	
    	private void move() {
    		if (coordinate == N) {
    			this.y++;
    		} else if (coordinate == E) {
    			this.x++;
    		} else if (coordinate == S) {
    			this.y--;
    		} else if (coordinate == W) {
    			this.x--;
    		}
    	}
    	
    	private void turnLeft() {
    		coordinate = (coordinate - 1) < N ? W : coordinate - 1;
    	}
    	
    	private void turnRight() {
    		coordinate = (coordinate + 1) > W ? N : coordinate + 1;
    	}
    	
    }
