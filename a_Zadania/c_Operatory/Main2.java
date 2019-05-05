/*
W pliku `Main2.java` stwórz trzy zmienne o nazwach: `nr1`, `nr2`, `resultModulo`.

1. Dwie pierwsze niech przechowują dowolne liczby całkowite.
2. Trzecia – o nazwie ``resultModulo`` – niech przechowuje liczbę 0.
3. Oblicz resztę z dzielenia **(modulo)** tych liczb (**nr1 modulo nr2**) i zapisz wynik w zmiennej ```resultModulo```.
4. Wypisz zmienną ``resultModulo``.

Upewnij się, że dobrze rozumiesz działanie operatora modulo, podstawiając do zadania różne liczby.
 */

public class Main2 {

	public static void main(String[] args) {
		int nr1 = 5;
		int nr2 = 12;
		int resultModulo = 0;
		resultModulo = nr1 % nr2;
		System.out.println(resultModulo); // modulo wynosi w tym przypadku 5

	}

}
