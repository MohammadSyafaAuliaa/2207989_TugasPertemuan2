//Buatlah algoritma dalam bahasa Java, menjumlahkan kode ASCII dari karakter ‘4’ dan
//karakter ‘6’!

public class SumASCII {
    public static void main(String[] args) {
        // Mendefinisikan karakter '4' dan '6'
        char karakter4 = '4';
        char karakter6 = '6';

        // Menghitung dan menjumlahkan kode ASCII dari karakter '4' dan '6'
        int asciiKarakter4 = (int) karakter4;
        int asciiKarakter6 = (int) karakter6;
        int hasilJumlah = asciiKarakter4 + asciiKarakter6;

        // Menampilkan hasil jumlah
        System.out.println("Kode ASCII dari karakter '4': " + asciiKarakter4);
        System.out.println("Kode ASCII dari karakter '6': " + asciiKarakter6);
        System.out.println("Hasil Jumlah Kode ASCII: " + hasilJumlah);
    }
}