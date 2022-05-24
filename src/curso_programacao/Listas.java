package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Luna");
		list.add("Penélope");
		list.add("Mariel");
		list.add("Luciana");
		list.add(2, "Bruce");
		
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list){
			System.out.println(x);
		}
		System.out.println("-----------");
		System.out.println("Index of Luna: " + list.indexOf("Luna"));
		System.out.println("Index of Lilian: " + list.indexOf("Lilian"));
		System.out.println("-----------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("-----------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	
	}
}
