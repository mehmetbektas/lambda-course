package tr.com.assistt.course.lambda.ex0;

public class Ex0 {
	
	public static void main(String[] args) {
		new Ex0().start();
	}

	private void start() {
		
//		int a = 0;
		
		Greeting greeting = () -> {
			System.out.println("Hello 1");
			//a++;
		};
		
		Greeting greeting2 = new Greeting() {
			@Override
			public void greet() {
				System.out.println("Hello 2");
			}
		};
		
		greeting.greet();
//		greeting2.greet();
	}
	
	
	
}

