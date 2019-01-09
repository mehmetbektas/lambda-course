package tr.com.assistt.course.lambda.exercises.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import tr.com.assistt.course.lambda.common.KlinikDto;

public class Ex4 {
	
	private void start() {
		List<KlinikDto> klinikList = findKlinik();
		/*Standart*/
		for (KlinikDto klinikDto : klinikList) {
			System.out.println(klinikDto);
		}

		/*Functional Interface*/
		klinikList.forEach(new Consumer<KlinikDto>() {
			@Override
			public void accept(KlinikDto klinik) {
				System.out.println(klinik);
			}
		});
		
		/*Lambda*/
		klinikList.stream().forEach(klinik -> {
			System.out.println(klinik);
		});
		
		
		boolean hasIdLambda = klinikList.stream().anyMatch(klinik -> klinik.getId() == -2);
		System.out.println("hasIdLambda: "+ hasIdLambda);
		boolean hasIdFI = klinikList.stream().anyMatch(new Predicate<KlinikDto>() {
			@Override
			public boolean test(KlinikDto t) {
				return t.getId() == -2;
			}
		});
		System.out.println("hasIdFI: "+ hasIdFI);

	}
	
	
	
	private List<KlinikDto> findKlinik(){
		List<KlinikDto> klinikDtos = new ArrayList<>();
		klinikDtos.add(new KlinikDto(1, 21, "Cerrahi", 17));
		klinikDtos.add(new KlinikDto(2, 42, "Di�", 16));
		klinikDtos.add(new KlinikDto(3, 34, "Beyin Sinir", 11));
		klinikDtos.add(new KlinikDto(4, 21, "Cerrahi", 13));
		klinikDtos.add(new KlinikDto(5, 21, "Cerrahi", 13));
		klinikDtos.add(new KlinikDto(6, 10, "Di�", 13));
		klinikDtos.add(new KlinikDto(7, 13, "Cerrahi", 6));
		klinikDtos.add(new KlinikDto(8, 25, "Cerrahi", 5));
		klinikDtos.add(new KlinikDto(9, 36, "Cerrahi", 3));
		klinikDtos.add(new KlinikDto(10, 45, "Cerrahi", 13));
		return klinikDtos;
	}
	

	public static void main(String[] args) {
		new Ex4().start();
	}
}
