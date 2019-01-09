package tr.com.assistt.course.lambda.exercises.ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import tr.com.assistt.course.lambda.common.KlinikDto;

public class Ex6 {

	private void start() {
		List<KlinikDto> klinikList = findKlinik();
		/* Standart */
		/**
		 * 		
		 */
		
		/* Lambda */
		List<String> klinikAdList = klinikList.stream()
				.filter(klinik -> klinik.getKlinikKodu() == 21)
				.map(KlinikDto::getKlinikAdi)
				.collect(Collectors.toList());

		System.out.println(klinikAdList);
		
		
		Function<Integer,Integer> add1 = x -> x + 1;
		
		int t = add1.apply(6);
		
		System.out.println(t);
	}

	private List<KlinikDto> findKlinik() {
		List<KlinikDto> klinikDtos = new ArrayList<>();
		klinikDtos.add(new KlinikDto(1, 21, "Cerrahi", 17));
		klinikDtos.add(new KlinikDto(2, 42, "Diş", 16));
		klinikDtos.add(new KlinikDto(3, 34, "Beyin Sinir", 11));
		klinikDtos.add(new KlinikDto(4, 21, "Cerrahi", 13));
		klinikDtos.add(new KlinikDto(5, 21, "Cerrahi", 13));
		klinikDtos.add(new KlinikDto(6, 10, "Diş", 13));
		klinikDtos.add(new KlinikDto(7, 13, "Cerrahi", 6));
		klinikDtos.add(new KlinikDto(8, 25, "Cerrahi", 5));
		klinikDtos.add(new KlinikDto(9, 36, "Cerrahi", 3));
		klinikDtos.add(new KlinikDto(10, 45, "Cerrahi", 13));
		return klinikDtos;
	}

	public static void main(String[] args) {
		new Ex6().start();
	}
}
