import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        float phi = 3.14f;
        float rusuk, luasP, volume;

        System.out.println("\t Luas Permukaan & Volume Bola \n");
        System.out.print(" Masukkan Rusuk : ");
        rusuk = userInput.nextFloat();

        luasP = luasPermukaan(rusuk);
        System.out.println("\n Luas Permukaannya : " + luasP);

        volume = volumeBola(rusuk);
        System.out.println("\n Volume Bolanya    : " + volume);
    }

    public static float luasPermukaan(float r) {
        float phi = 3.14f;
        float hasil;

        hasil = 4 * phi * r * r;
        return hasil;
    }

    public static float volumeBola(float r) {
        float phi = 3.14f;
        float hasil;

        hasil = 4 / (float) 3 * phi * r * r * r;
        return hasil;
    }
}