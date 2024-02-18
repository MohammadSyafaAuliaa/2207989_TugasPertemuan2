//Buatlah algoritma dalam Bahasa Java Anda akan keluar membeli migacoan jika
//mempunyai uang lebih besar dari 10000 (rupiah) dan pasangan Anda sedang tidak ad a
//kelas di kuliahanya, yang dapat ditulis sebagai ekspresi: (uang > 10000) &&
//(!tidakAdaKelasKuliah)

import java.util.Scanner;

public class BeliMigacoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input jumlah uang yang dimiliki
        System.out.print("Masukkan jumlah uang Anda : ");
        int uang = scanner.nextInt();

        // Menerima input status apakah ada kelas kuliah atau 
        System.out.print("Apakah pacar anda ada kelas kuliah (true/false): ");
        boolean adaKelasKuliah = scanner.nextBoolean();

        // Menentukan pesan output berdasarkan kondisi
        String Message = (uang > 10000 && !adaKelasKuliah) ? "Anda dapat membeli migacoan!" :
                               "Anda tidak dapat membeli migacoan karena pacar anda ada kelas kuliah atau uang tidak anda mencukupi.";

        // Menampilkan pesan output
        System.out.println(Message);

        // Menutup objek Scanner
        scanner.close();
    }
}
