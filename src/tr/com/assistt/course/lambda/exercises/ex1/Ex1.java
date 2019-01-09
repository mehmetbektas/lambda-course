package tr.com.assistt.course.lambda.exercises.ex1;

public class Ex1 {
	
	public static void main(String[] args) {
		new Ex1().start();
	}

	private void start() {
		
		StringLengthFinder stringLengthFinder1 = (String str) -> {
			return str != null ? str.length() : -1;
		};
		
		StringLengthFinder stringLengthFinder2 = new StringLengthFinder() {
			@Override
			public int findLength(String str) {
				return str != null ? str.length() : -1;
			}
		};
		
		System.out.println("Length: " + stringLengthFinder1.findLength("Eclipse"));
		System.out.println("Length: " + stringLengthFinder2.findLength(null));
		
	}
	
	
	
}

