
public class Y extends Thread {
	private int y;
	
	public Y () {
		y = 0;
	}
	
	public Y (int number) {
		y = number;
	}
	
	public void calculateY () {
		for (int i = 0; i < 10; i++) {
			int calcResult = y + 3;
			System.out.println("The value of y is " + calcResult);
			while (y == 9) {
				Thread.yield();
			}
		}
	}
	
	public void run () {
		calculateY();
	}
}