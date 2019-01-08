package tr.com.assistt.course.lambda.ex99;

import java.util.ArrayList;
import java.util.List;

public class Ex0 {
	
	private void start() {
		
		findKlinik().stream().findFirst().get().getId();
		
	}
	
	
	
	private List<KlinikDto> findKlinik(){
		List<KlinikDto> klinikDtos = new ArrayList<>();
		klinikDtos.add(new KlinikDto(1, 21, "Cerrahi", 1));
		klinikDtos.add(new KlinikDto(2, 42, "Diþ", 1));
		klinikDtos.add(new KlinikDto(3, 34, "Beyin Sinir", 1));
		klinikDtos.add(new KlinikDto(4, 21, "Cerrahi", 1));
		klinikDtos.add(new KlinikDto(5, 21, "Cerrahi", 1));
		klinikDtos.add(new KlinikDto(6, 10, "Diþ", 1));
		klinikDtos.add(new KlinikDto(7, 13, "Cerrahi", 1));
		klinikDtos.add(new KlinikDto(8, 25, "Cerrahi", 1));
		klinikDtos.add(new KlinikDto(9, 36, "Cerrahi", 1));
		klinikDtos.add(new KlinikDto(10, 45, "Cerrahi", 1));
		return klinikDtos;
	}
	

	public static void main(String[] args) {
		new Ex0().start();
	}
}
