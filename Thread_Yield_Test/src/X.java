
public class X extends Thread {
	private int x;
	
	public X () {
		x = 0;
	}
	
	public X (int number) {
		x = number;
	}
	
	public void calculateX () {
		for (int i = 0; i < 10; i++) {
			int calcResult = x + 2;
			System.out.println("The value of x is " + calcResult);
			while (x == 8) {
				Thread.yield();
			}
		}
	}
	
	public void run () {
		calculateX();
	}
}
