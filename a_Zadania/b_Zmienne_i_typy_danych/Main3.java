/*
W pliku `Main3.java` stwórz trzy zmienne o nazwach: `nr1, nr2, result`.

1. Jedna niech przechowuje dowolną **liczbę całkowitą**.
2. Druga – dowolną **liczbę zmiennoprzecinkową** typu double.
3. Trzecia – o nazwie `result` – niech przechowuje liczbę `0`.
4. Zapisz sumę tych liczb w zmiennej `result` i wypisz wynik na konsoli.


Napisz w komentarzu jakiego typu i dlaczego powinna być zmienna result.
*/


public class Main3 {

	public static void main(String[] args) {
		int nr1 = 2;
		double nr2 = 2.3;
		double result = 0;
		result = nr1 + nr2 + result;
		System.out.println(result);
	}

}
