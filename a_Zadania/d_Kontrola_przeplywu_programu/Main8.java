/*
W pliku `Main8.java`, jest program, który wypisuje w konsoli
schemat z `n` gwiazdek, taki jak poniżej.  
Przeanalizuj go bardzo dokładnie.
Przykład dla  ```n = 5```:

```
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

Używamy do tego zadania pętli zagnieżdżonych!
*/

public class Main8 {

	public static void main(String[] args) {
	    //definicja zmiennej z liczbą rzędów i gwiazdek w wierszu
	    int n = 5;

	    //tworzymy pętlę która będzie generowała nam WIERSZE
	    for (int i = 0; i < n; i++) {
	        String row = "";//zmienna która jest zerowana na początku każdej iteracji, przechowująca gwiazdki z wiersza

	        //tworzymy pętlę generującą nam gwiazdki w wierszu
	        for (int j = 0; j < n; j++) {
	            row += "* ";
	        }
	        System.out.print(row + "\n");//wyświetlamy gwiazdki z wiersza i dodajemy znak nowej lini
	    }
	}

}
