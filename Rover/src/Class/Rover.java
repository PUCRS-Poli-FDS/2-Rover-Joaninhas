package Class;

public class Rover {
	
    	public static final int N = 1;
    	public static final int E = 2;
    	public static final int S = 3;
    	public static final int W = 4;
    	
    	int x = 0;
    	int y = 0;
    	int coordenadas = N;
    	
    	public Rover() {
    		
    	}
    	
    	public void setPosition(int x, int y, int coordenadas) {
    		this.x = x;
    		this.y = y;
    		this.coordenadas = coordenadas;
    	}
    	
    	public void printPosition() {
    		char dir = 'N';
    		if (coordenadas == 1) {
    			dir = 'N';
    		} else if (coordenadas == 2) {
    			dir = 'E';
    		} else if (coordenadas == 3) {
    			dir = 'S';
    		} else if (coordenadas == 4) {
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
    					"Speak in Mars language, please!");
    		}
    	}
    	
    	private void move() {
    		if (coordenadas == N) {
    			this.y++;
    		} else if (coordenadas == E) {
    			this.x++;
    		} else if (coordenadas == S) {
    			this.y--;
    		} else if (coordenadas == W) {
    			this.x--;
    		}
    	}
    	
    	private void turnLeft() {
    		coordenadas = (coordenadas - 1) < N ? W : coordenadas - 1;
    	}
    	
    	private void turnRight() {
    		coordenadas = (coordenadas + 1) > W ? N : coordenadas + 1;
    	}
    	
    }
