/*
1. W pliku `Main5.java` stwórz zmienną `resultFor` oraz `resultWhile` i przypisz do obu wartość `0`.
2. Następnie stwórz pętlę `for`, która doda do siebie liczby od 1 do 10 i zapisze wynik do zmiennej `resultFor`.
3. Analogicznie stwórz pętlę `while` i zapisz wynik do zmiennej `resultWhile`.
4. Pętle powinny – co uruchomienie (zwane także iteracją pętli) – dodawać do zmiennej `resultFor` lub `resultWhile` kolejną liczbę z podanego zakresu.
5. Wypisz w konsoli, w oddzielnych liniach, zmienne `resultFor` oraz `resultWhile`.
 */

public class Main5 {

	public static void main(String[] args) {
		int resultFor = 0;
		int resultWhile = 0;

		for (int i = 0; i < 10; i++) {
			resultFor = resultFor + i;
			System.out.println(resultFor);
		}

		int i = 0;
		while (i < 10) {
			resultWhile = resultWhile + i;
			System.out.println(resultWhile);
			i++;
		}

	}

}
