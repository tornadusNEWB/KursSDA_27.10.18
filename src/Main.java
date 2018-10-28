import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Zadanie 1

         */
/*
        int i = 3;

        if (i % 2 == 0) {
            System.out.println("liczba jest parzysta");
        } else {
            System.out.println("liczba nie jest parzysta");
        }
*/
        /*
        Zadanie 2
*/
        /*
        Scanner scanner = new Scanner(System.in);

        int liczba;
        int suma = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("podaj 3 liczby, dodam tylko parzyste");
            liczba = scanner.nextInt();

            if (liczba % 2 == 0) {
                suma = liczba + suma;
            }
        }
        System.out.println(suma);
        */

        /*
        Zadanie 3
         */

        /*
        int liczba;
        int suma = 0;
        int roznica = 0;
        int[] przechowalniaLiczb = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("podaj 5 liczb, dodam parzyste, a nieparzyste odejme");
            liczba = scanner.nextInt();

            if (liczba % 2 == 0) {
                suma = liczba + suma;
                przechowalniaLiczb[i] = liczba;
            } else {
                roznica = roznica - liczba;
                przechowalniaLiczb[i] = liczba;
            }
        }
        System.out.println(suma);

        System.out.println(roznica);

        for (int liczby : przechowalniaLiczb) {
            System.out.println(liczby);
        }
        */

        /*
        Zadanie 4
         */
        /*
        int suma = 0;

        int[] tablica = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int liczby : tablica) {
            suma += liczby;
        }
        System.out.println(suma);
        System.out.println("srednia to: " + suma / tablica.length);
        */

        /*
        Zadanie 5
        */
        /*
        int[] tablica = {4, 1, 3, 4, 555, 6, 7, 88, 49, 2};
        int max = tablica[0];
        int min = tablica[0];
        int maxIndex = tablica[0];
        int minIndex = tablica[0];

        for (int liczby : tablica) {
            if (liczby > max) {
                max = liczby;
            }
            if (liczby < min) {
                min = liczby;
            }
        }
        int index = 0;
        int index1 = 0;
        for (int i = 1; i < tablica.length; i++) {
            if (maxIndex < tablica[i]) {
                index = i;
                maxIndex = tablica[i];
            }
            if (minIndex > tablica[i]) {
                index1 = i;
                minIndex = tablica[i];
            }
        }
        System.out.println("maksymalna liczba w tablicy to " + max + " jest pod indexem " + index);
        System.out.println("minimalna liczba w tablicy to " + min + " jest pod indexem " + index1);
        */

        /*
        Zadanie 6
         */
        /*
        int liczba = 0;

        List<Integer> lista = new ArrayList<Integer>();
        List<Integer> listaParzyste = new ArrayList<Integer>();
        List<Integer> listaNieparzyste = new ArrayList<Integer>();
        do {
            System.out.println("podaj liczby, jesli podasz 0 - bedzie koniec");
            liczba = scanner.nextInt();
            lista.add(liczba);

            if (liczba % 2 == 0 && liczba != 0) {
                listaParzyste.add(liczba);
            }
            if (liczba % 2 != 0) {
                listaNieparzyste.add(liczba);
            }
        } while (liczba != 0);
        System.out.println("ilosc wszystkich elemetów " + lista.size());
        System.out.println("elementy w liscie " + lista);
        System.out.println("ilosc elementow parzystych w liscie " + listaParzyste.size());
        System.out.println("elementy parzyste w liscie " + listaParzyste);
        System.out.println("ilosc elementow nieparzystych w liscie " + listaNieparzyste.size());
        System.out.println("elementy nieparzyste w liscie " + listaNieparzyste);

        */
        /*
        Zadanie 8
         */
        /*
        String slowo = "mama";
        System.out.println("slowo w polowie " + slowo.substring(0, slowo.length() / 2));
        System.out.println("dlugosc twojego slowa " + slowo.length());
        */

        /*
        Zadanie 9
         */
        /*
        String palindrom = "ello";
        System.out.println(palindrom.equals(new StringBuffer().append(palindrom).reverse().toString()));
        */
        /*
        Zadanie 10
         */
/*
        String text = "Ala ma kota a kot ma Ale ma ma ma kot ma kot Ala";
        String[] splittedText = text.split(" ");

        Map<String, Integer> uniqueWordsCounter = new HashMap<>();

        for (String word : splittedText) {
            boolean isUnique = true;
            for (String uniqueWord : uniqueWordsCounter.keySet()) {
                if (word.equals(uniqueWord)) {
                    isUnique = false;
                    int count = uniqueWordsCounter.get(word);

                    uniqueWordsCounter.put(word, ++count);
                    break;
                }
            }
            if (isUnique) {
                uniqueWordsCounter.put(word, 1);
            }
        }
        System.out.println(uniqueWordsCounter);


        int max = 0;
        int min = 1; // bo kazde wysatpienie kazdej z nich to minumum 1
        for (Integer value : uniqueWordsCounter.values()) {

            if (max < value) {
                max = value;
            }

            if (min > value) {
                min = value;
            }
        }
        for (String word : uniqueWordsCounter.keySet()) {
            if (min == uniqueWordsCounter.get(word)) {
                System.out.println("najmniej:" + word + ", ");
            }
        }
        for (String word : uniqueWordsCounter.keySet()) {
            if (max == uniqueWordsCounter.get(word)) {
                System.out.println("najwiecej:" + word);
            }
        }
        System.out.println(max);
        System.out.println(min);

        */

/*
Zadanie 11
 */
/*
        int silnia = 1;
        int liczba = 7;
        for (int i = 1; i <= liczba; i++) {
            silnia *= i;
        }
        System.out.println(silnia);
*/
/*
Zadanie 12
 */
        /* metoda rekurencyjna */


    }
}









