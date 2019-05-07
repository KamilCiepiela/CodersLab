/*
1. Stwórz tablicę o nazwie `numbers` z 10 dowolnymi liczbami.
2. W pętli ```for``` sprawdź, które są parzyste i wypisz je w konsoli **jedna pod drugą**.
3. Utwórz dodatkową zmienną `sumOdd` o wartości `0`.
4. Zmodyfikuj pętlę z pkt. 1 w ten sposób, aby **dodatkowo** sumowała liczby nieparzyste.
5. Wyświetl w konsoli dodatkowy komunikat, wg wzoru: `Suma liczb nieparzystych to: 87.`.
*/

public class Main4 {

	public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 12, 300, 125, 2, 8, 61, 1000};
        int sumOdd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
	    }
            if (numbers[i] % 2 != 0) {
                sumOdd += numbers[i];
            }
        }
        System.out.println("");
        System.out.println(sumOdd);

	}

}
