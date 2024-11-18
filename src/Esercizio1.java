import java.util.Scanner;

public class Esercizio1 {
    static Scanner scanner = new Scanner(System.in);

    // salve
    public void resMultiplication() {

        System.out.println("Hello world!");

        System.out.println("inserisci primo numero");
        int x = scanner.nextInt();

        System.out.println("inserisci secondo numero");
        int y = scanner.nextInt();

        int sum = x * y;
        System.out.println(sum);
    }

    public void concat() {

        System.out.println("inserisci stringa");
        String stringCiao = scanner.next();

        System.out.println("inserisci integer");
        int number = scanner.nextInt();

        String concat = stringCiao + number;

        System.out.println(concat);
    }

    public void arrayString() {

        String[] stringaArray = new String[5];
        System.out.println("inserisci elemento dell'array");
        stringaArray[0] = scanner.next();
        System.out.println("inserisci elemento dell'array");
        stringaArray[1] = scanner.next();
        System.out.println("inserisci elemento dell'array");
        stringaArray[2] = scanner.next();
        System.out.println("inserisci elemento dell'array");
        stringaArray[3] = scanner.next();
        System.out.println("inserisci elemento dell'array");
        stringaArray[4] = scanner.next();

        System.out.println("inserisci una stringa");
        String stringa = scanner.next();

        String[] newStringArr = new String[6];
        newStringArr[0] = stringaArray[0];
        newStringArr[1] = stringaArray[1];
        newStringArr[2] = stringa;
        newStringArr[3] = stringaArray[2];
        newStringArr[4] = stringaArray[3];
        newStringArr[5] = stringaArray[4];


        for (String element : newStringArr) {
            System.out.println(element);
        }
    }


}
