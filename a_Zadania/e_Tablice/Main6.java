/*
W pliku `Main6.java`

1. Stwórz tablicę z 10 dowolnymi liczbami, tablicę nazwij `numbers`.
2. Wypisz elementy tablicy od końca, używając pętli ```for``` – każdy element w nowej linii.
 */

public class Main6 {

	public static void main(String[] args) {

		int[] numbers = {1, 4, 7, 12, 300, 125, 2, 8, 61, 1000};

		for (int i = numbers.length-1; i >= 0 ; i--) {
			System.out.println(numbers[i]);

		}

	}

}
