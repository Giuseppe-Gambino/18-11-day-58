import java.util.Scanner;

public class Esercizio2 {
    static Scanner scanner = new Scanner(System.in);

    public void insString() {
        String[] treStringhe = new String[3];
        System.out.println("inserisci elemento dell'array");
        treStringhe[0] = scanner.next();
        System.out.println("inserisci elemento dell'array");
        treStringhe[1] = scanner.next();
        System.out.println("inserisci elemento dell'array");
        treStringhe[2] = scanner.next();

        System.out.println("questo e l'array");
        for (String element : treStringhe) {
            System.out.println(element);
        }

        String[] reverseArray = new String[3];
        reverseArray[0] = treStringhe[2];
        reverseArray[1] = treStringhe[1];
        reverseArray[2] = treStringhe[0];

        System.out.println("questo e l'array reversato");

        for (String element : reverseArray) {
            System.out.println(element);
        }
    }
}
