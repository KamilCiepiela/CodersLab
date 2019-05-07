/*
W pliku `Main11.java` napisz program rysujący, na podstawie wartości zmiennej `n`, następujący schemat (tutaj dla ```n = 5```):

```
* 2 3 4 5
* * 3 4 5
* * * 4 5
* * * * 5
* * * * *
* * * * *
* * * * 5
* * * 4 5
* * 3 4 5
* 2 3 4 5
```

Do stworzenia takiego zapisu, w środku zagnieżdżonej pętli, użyj wyrażenia warunkowego `if`, dzięki któremu zdecydujesz czy wypisać gwiazdkę, czy licznik z zagnieżdżonej pętli.
 */

public class Main11 {

    public static void main(String[] args) {

        int i, j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i >= j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(j + " ");
                }

            }
            System.out.println();
        }

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i <= (n-j+1)) {
                    System.out.print("* ");

                }
                else {
                    System.out.print(j + " ");
                }

            }
            System.out.println();
        }

    }

}
