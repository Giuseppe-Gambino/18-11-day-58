import java.util.Scanner;

public class Esercizio3 {

    static Scanner scanner = new Scanner(System.in);

    public void perimetro() {
        System.out.println("inserisci primo lato");
        double lato1 = scanner.nextDouble();
        System.out.println("inserisci secondo lato");
        double lato2 = scanner.nextDouble();

        double res = (lato1 + lato2) * 2;
        System.out.println(res);
    }


    public void pariDispari() {

        System.out.println("inserisci numero di verificare");
        int number = scanner.nextInt();


        if (number % 2 == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");

        }
    }

    public void area() {
        System.out.println("inserisci primo lato");
        double lato1 = scanner.nextDouble();
        System.out.println("inserisci secondo lato");
        double lato2 = scanner.nextDouble();
        System.out.println("inserisci terzo lato");
        double lato3 = scanner.nextDouble();

        double s = (lato1 + lato2 + lato3) / 2;


        double area = Math.sqrt(s * (s - lato1) * (s - lato2) * (s - lato3));


        System.out.println("L'area del triangolo è: " + area);
    }


}

