package tr.com.assistt.course.lambda.exercises.ex0;

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
		greeting2.greet();
		
		
		/*Method reference */
		Greeting greeting3 = Ex0::referencedMethod;
		greeting3.greet();
	}
	
	
	public static void referencedMethod() {
		System.out.println("Method reference");
	}
	
	
}

