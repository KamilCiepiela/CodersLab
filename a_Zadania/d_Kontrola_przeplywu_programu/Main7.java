/*
1. W pliku `Main7.java` stwórz dwie pętle niezależne i wypisz wartości ich liczników
w każdej iteracji.
2. Wykorzystaj np.```System.out.println("i= " + i + " j= " + j);```
3. Zadanie rozwiąż używając dwóch pętli `for`.

*Podpowiedź: Zasada tworzenia pętli zagnieżdżonych (zależnych i niezależnych) została
omówiona w prezentacji **Podstawy programowania**. Jeśli masz wątpliwości, zajrzyj do
sekcji **Pętle: for, for zagnieżdżony oraz while** w tej prezentacji.*

 */
public class Main7 {

	public static void main(String[] args) {
		for (int i = 0; i <10; i++) {
			for (int j = 0; j < 10; j++){
				System.out.println("i = " + i + ", j = " + j);
			}
		}

	}

}
