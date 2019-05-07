/*
W pliku `Main15.java`

1. Napisz program liczący wartość `x!`, gdzie `!` oznacza silnię, a `x` jest zmienną.
2. Użyj do tego obu znanych Ci pętli.
3. Silnia ma być zapisana do zmiennej `factorial`.
4. Po wyliczeniu silni wyświetl w konsoli komunikat wg wzoru: `Silnia 3! to 6.`.

**Silnia** to wynik mnożenia wszystkich liczb całkowitych od jeden do podanej liczby włącznie, czyli:

```
5! = 1*2*3*4*5 = 120
8! = 1*2*3*4*5*6*7*8 = 40320
 */

public class Main15 {

    public static void main(String[] args) {

        int n = 8;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Silnia " + n + "! to " + factorial + ".");
    }

}
