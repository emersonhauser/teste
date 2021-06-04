import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
		
		
		String collect = lista.stream()
			.filter(e -> e%2 == 0)
			.distinct()
			.map(e -> String.valueOf(e))
			.collect(Collectors.joining("|"));
		
		System.out.println(collect);
	}
}
