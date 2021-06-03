import java.util.Arrays;
import java.util.List;

public class Java8Streams {
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
		
//		for(Integer x: lista) {
//			System.out.println(x);
//		}
		
		lista.stream()
			.filter(e -> e/2 == 3 && e%2 == 0)
			.map(e -> e*2)
			.forEach(e -> System.out.println(e));
	}
}
