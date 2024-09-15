import java.util.Scanner;

public class Balok {
    
    // Method untuk menghitung volume balok, yang memiliki parameter panjang, lebar, tinggi betipe data double
    public static double hitungVolume(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // input panjang
        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();

        // input lebar
        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();

        // input tinggi
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();

        // memanggil method hitungVolume() dan menyimpan hasilnya ke variabel volume
        double volume = hitungVolume(panjang, lebar, tinggi);

        // Print hasil perhitungan volume balok
        System.out.println("Volume balok adalah: " + volume + " kubik.");

        // Menutup Scanner
        input.close();
    }
}
