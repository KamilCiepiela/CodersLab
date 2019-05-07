/*
W pliku `Main3.java`

1. Stwórz tablicę z 10 dowolnymi liczbami, tablicę nazwij `numbers`.
2. Stwórz zmienną  ```sum``` i przypisz do niej liczbę `0`.
3. Za pomocą pętli ```for``` oblicz sumę liczb z tablicy.
4. Wypisz sumę na konsoli, wg wzoru: `Suma elementów tablicy to: 381.`.
*/

public class Main3 {

	public static void main(String[] args) {
        	int[] numbers = {1,4,7,12,300,125,2,8,60,1000};
        	int sum = 0;

        	for (int i = 0; i < numbers.length; i++) {
            	sum += numbers[i];
        	}
        	System.out.println("Suma elementów tablicy to: " + sum + ".");
	}

}
