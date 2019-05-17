/*W pliku `Main10.java` napisz program rysujący na podstawie wartości zmiennej `n` następujący schemat (tutaj dla ```n = 5```).  

```
*
* *
* * *
* * * *
* * * * *
```

Możesz to zadanie rozwiązać na dwa sposoby:

1. używając pętli zależnych,
2. używając pętli niezależnych i instrukcji warunkowej `if`.

*Wzoruj się na poprzednich zadaniach. Trzeba tutaj trochę pomyśleć i rozumieć pętle zagnieżdżone.*
*/

public class Main10 {

    public static void main(String[] args) {

        for (int row = 1; row <= 5; ++row) {
            for (int col = 1; col <= row; ++col) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
