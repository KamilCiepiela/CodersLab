/*
Otwórz plik `Main5.java`.
Spróbuj – bez uruchamiania – odpowiedzieć na pytanie jaki będzie wynik programu zawartego w pliku.

Zweryfikuj własne przypuszczenia poprzez uruchomienie programu.

Opisz w komentarzu wyjaśnienie działania programu.
 */

public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
		System.out.println(++a); //wartość zostanie zwiększona do 2 i wyświetlona
		System.out.println(a++); //wartość 2 zostanie wyświetlona i potem zwiększona do 3
		System.out.println(a); //wartość 3 zostanie wyświetlona 
		b=a++; //w tej linii wartość b to 3
		System.out.println(b); //wartość b to dalej 3, bo dodawanie nastąpi po działaniu
		b=++a; //wartość b to 5 (4 z poprzedniego działania + 1 przed działaniem)
		System.out.println(++a); //wartość to 5+1 przed wyświetleniem działania = 6 
	}

}
