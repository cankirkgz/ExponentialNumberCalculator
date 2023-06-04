import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int taban, us;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tabanı giriniz: ");
        taban = scanner.nextInt();

        System.out.print("Üssü giriniz: ");
        us = scanner.nextInt();

        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println(taban + " üzeri " + us + " = " + sonuc);
    }
}