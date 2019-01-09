package tr.com.assistt.course.lambda.exercises.ex3;

public class Ex3 {

	public static void main(String[] args) {
		new Ex3().start();
	}

	private void start() {
		
		
		doProcess(10, i -> {
			System.out.println("Lambda Example");
			System.out.println("Value of i is " + i);
			System.out.println(this); 
		});
		
		doProcess(20, new ProcessViewer() {
			@Override
			public void viewDetail(int i) {
				System.out.println("Functional Interface Example");
				System.out.println("Value of i is " + i);
				System.out.println(this);
						
			}

		});
		
	}
	
	
	public void doProcess(int i, ProcessViewer processViewer) {
		processViewer.viewDetail(i);
	}
	
}
