package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
	int x;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" Hello from thread number: " + x);
		if(x<=50) {
			int y = x+1;
			
			Thread x = new Thread((Runnable) new ThreadedGreeter(y));
		}
	}

	public ThreadedGreeter(int i) {
		x=1;
	}

}
