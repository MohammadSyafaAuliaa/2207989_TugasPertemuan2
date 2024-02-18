//Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah masukan
//bilangan bulat negatif dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan!

import java.util.Scanner;

public class OperasiBilangan {
    public static void main(String[] args) {
        // Menerima input pertama
        try ( 
                Scanner scanner = new Scanner(System.in)) {
            // Menerima input pertama
            System.out.print("Masukkan bilangan pertama (negatif): ");
            int bilangan1 = scanner.nextInt();
            // Menerima input kedua
            System.out.print("Masukkan bilangan kedua (negatif): ");
            int bilangan2 = scanner.nextInt();
            // Menerima input ketiga
            System.out.print("Masukkan bilangan ketiga (negatif): ");
            int bilangan3 = scanner.nextInt();
            // Validasi bilangan negatif
            if (bilangan1 >= 0 || bilangan2 >= 0 || bilangan3 >= 0) {
                System.out.println("Masukkan harus berupa bilangan bulat negatif.");
                // Menutup objek Scanner
                scanner.close();
                return;
            }  
         
            // Menampilkan hasil operasi penjumlahan
            int hasilPenjumlahan = bilangan1 + bilangan2 + bilangan3;
            System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
            // Menampilkan hasil operasi pengurangan
            int hasilPengurangan = bilangan1 - bilangan2 - bilangan3;
            System.out.println("Hasil Pengurangan: " + hasilPengurangan);
            // Menampilkan hasil operasi perkalian
            int hasilPerkalian = bilangan1 * bilangan2 * bilangan3;
            System.out.println("Hasil Perkalian: " + hasilPerkalian);
            // Menampilkan hasil operasi pembagian
            if (bilangan2 != 0 && bilangan3 != 0) {
                double hasilPembagian = (double) bilangan1 / bilangan2 / bilangan3;
                System.out.println("Hasil Pembagian: " + hasilPembagian);
            } else {
                System.out.println("Tidak bisa membagi dikarenakan ada pembagi 0");
            }
        }
    }
}
