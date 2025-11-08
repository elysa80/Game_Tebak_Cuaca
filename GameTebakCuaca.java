import java.util.Scanner;
import java.util.Random;

public class GameTebakCuaca {
    private String kota;
    private String kondisi;
    private final String[] kondisiCuaca = {"Panas", "Hujan", "Berawan", "Dingin"};

    // Method untuk input kota dan acak cuaca
    public void mulaiGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Game Tebak Cuaca ===");
        System.out.print("Masukkan nama kota: ");
        kota = input.nextLine();
        acakCuaca();

        System.out.print("Tebak cuaca di " + kota + " (Panas/Hujan/Berawan/Dingin): ");
        String tebakan = input.nextLine();

        if(tebakCuaca(tebakan)) {
            System.out.println("Benar! Cuaca di " + kota + " adalah " + kondisi);
        } else {
            System.out.println("Salah! Cuaca di " + kota + " adalah " + kondisi);
        }
    }

    // Method untuk mengacak cuaca
    private void acakCuaca() {
        Random rand = new Random();
        int index = rand.nextInt(kondisiCuaca.length);
        kondisi = kondisiCuaca[index];
    }

    // Method untuk cek tebakan
    private boolean tebakCuaca(String tebakan) {
        return kondisi.equalsIgnoreCase(tebakan);
    }

    public static void main(String[] args) {
        GameTebakCuaca game = new GameTebakCuaca();
        game.mulaiGame();
    }
}
