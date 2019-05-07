/*
W pliku `Main14.java` napisz program tworzący tabliczkę mnożenia dla podanej zmiennej `n`.
Na przykład dla ```n = 3``` wynik będzie następujący:

```
1 x 1 = 1
1 x 2 = 2
1 x 3 = 3

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6

3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
```

Do mnożenia liczb użyj operatora `*`.

Pamiętaj, aby dodać spację pomiędzy liczbami i `x` oraz `=`.
 */

public class Main14 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();
        }

    }

}
