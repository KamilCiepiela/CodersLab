/*
W pliku `Main3.java` stwórz trzy zmienne o nazwach: `str1`, `str2`, `joinedStrings`.

		1. Dwie niech przechowują napisy: `str1` – `Kurs`, a `str2` – `Java`.
		2. Trzecia – o nazwie ```joinedStrings```, niech przechowuje pusty String, np.: `String joinedStrings = "";`.
		3. Połącz Stringi za pomocą konkatenacji (`+`) i zapisz wynik w zmiennej ```joinedStrings```.
		4. Wypisz wynik w konsoli.
*/

public class Main3 {

	public static void main(String[] args) {
		String str1 = "To jest ";
		String str2 = "napis!";
		String joinedStrings = str1 + str2;
		System.out.println(joinedStrings);

	}

}
