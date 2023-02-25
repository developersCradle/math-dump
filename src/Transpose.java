import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Transpose {
//Here collection different transpose operations for different input types

	public static int alkuperainenMatriisi[][] = { { 1, 2, 3 }, // Eka rivi
			{ 4, 5, 6 }, // Toka rivi
			{ 7, 8, 9 }, // Kolmas rivi
	};

	public static void main(String[] args) {

//		   IntStream flatMapToInt = Arrays.stream(alkuperainenMatriisi).flatMapToInt(x -> Arrays.stream(x));

//		   flatMapToInt.forEach(e -> System.out.println(e));
//		   stream.forEach(element -> System.out.println(element));

		System.out.println("Matriisi ilman transponointia:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(alkuperainenMatriisi[i][j] + " ");
			}
			System.out.println();// new line
		}

	}

}