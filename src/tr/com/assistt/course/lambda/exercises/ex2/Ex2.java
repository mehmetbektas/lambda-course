package tr.com.assistt.course.lambda.exercises.ex2;

public class Ex2 {

	public static void main(String[] args) {
		new Ex2().start();
	}

	private void start() {
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 1 is started.");
			}
		});
		
		Thread thread2 = new Thread(() -> {
			System.out.println("Thread 2 is started.");
			new RuntimeException("Test Exception").printStackTrace();
		});		
		
		thread1.start();
		thread2.start();
	}

}
