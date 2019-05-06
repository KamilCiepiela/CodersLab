/*
1. W pliku `Main3.java` stwórz pętlę, która 10 razy wypisze w konsoli tekst: *"Lubię Javę"*.
2. Napisz zarówno pętlę `for` jak i pętlę `while`.
3. W sumie napis będzie widoczny 20 razy.
 */

public class Main3 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++){
			System.out.println(i + " Lubię Javę");
		}

		int i = 0;
		while (i < 10) {
			System.out.println(i + " Lubię Javę");
			i++;
		}

	}

}
